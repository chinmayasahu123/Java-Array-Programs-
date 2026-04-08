package stringProgramming;

import java.util.Scanner;

public class ReverseTheStringRetainingVowelsPos {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static String extractCharsWithoutVowels(String str) {
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			if(!isVowel(str.charAt(i)))
				s+=str.charAt(i);
		}
		return s;
	}
	public static String reverseString(String str) {
		String s=extractCharsWithoutVowels(str);
		String rev="";int index=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(isVowel(ch))
				rev+=ch;
			else
				rev+=s.charAt(index++);
		}
		return rev;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
    String str=sc.next();
    System.out.println("Original string:"+str);
    System.out.println("Reversed string:"+reverseString(str));
	}

}
