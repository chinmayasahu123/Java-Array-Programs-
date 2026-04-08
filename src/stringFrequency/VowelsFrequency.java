package stringFrequency;

import java.util.Scanner;

public class VowelsFrequency {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static char[] toCharArray(String str) {
		char arr[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			arr[i]=str.charAt(i);
		return arr;
	}
	public static void frequencyOfVowel(char arr[]) {
		char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=ch&&isVowel(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]&&arr[j]!=ch&&isVowel(arr[j])) {
						count++;
						arr[j]=ch;
					}
				}
				System.out.println(arr[i]+"->"+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
		char ch[]=toCharArray(str);
		frequencyOfVowel(ch);

	}

}
