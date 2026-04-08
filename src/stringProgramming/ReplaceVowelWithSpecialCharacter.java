package stringProgramming;

import java.util.Scanner;

public class ReplaceVowelWithSpecialCharacter {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static String replace(String str,char ch) {
		String newString="";
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(isVowel(ch1))
				newString+=ch;
			else
				newString+=ch1;
		}
		return newString;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    System.out.println("Enter a special character:");
    char ch=sc.next().charAt(0);
    System.out.println("Original string:"+str);
    System.out.println("New string:"+replace(str,ch));
	}

}
