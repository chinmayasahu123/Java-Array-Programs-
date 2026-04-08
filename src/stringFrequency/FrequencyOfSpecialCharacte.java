package stringFrequency;

import java.util.Scanner;

public class FrequencyOfSpecialCharacte {

	public static char[] toCharArray(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static boolean isSpecialCharacter(char ch) {
		if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')))
			return true;
		return false;
	}
	public static int specialCharacterFrequency(char arr[]) {
		char ch=Character.MIN_VALUE;int specialCharCount=0;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=ch&&isSpecialCharacter(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=ch&&arr[i]==arr[j]&&isSpecialCharacter(arr[j])) {
						count++;
						specialCharCount++;
						arr[j]=ch;
					}
				}
				System.out.println(arr[i]+"->"+count);
			}
		}
		return specialCharCount;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    char ch[]=toCharArray(str);
    if(specialCharacterFrequency(ch)==0)
    	System.out.println("No special characters.");;
	}

}
