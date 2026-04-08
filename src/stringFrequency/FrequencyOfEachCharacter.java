package stringFrequency;

import java.util.Scanner;

public class FrequencyOfEachCharacter {

	public static void frequency(char arr[]) {
		char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=ch) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=ch&&arr[j]==arr[i]) {
						count++;
						arr[j]=ch;
					}
				}
				System.out.println(arr[i]+"->"+count);
			}
			
		}
	}
	public static char[] toChar(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
        char ch[]=toChar(str);
        frequency(ch);
	}

}
