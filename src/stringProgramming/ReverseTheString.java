package stringProgramming;

import java.util.Scanner;

public class ReverseTheString {
	
	public static String reverseTheString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}
	public static String vowelsString(String str) {
		String newString="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(isVowel(ch))
			newString+=ch;
		}
		return newString;
	}
	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    String vowelString=vowelsString(str);
	    String rev=reverseTheString(vowelString);
	    System.out.println("Reversed only vowels string "+rev);
	}

}
