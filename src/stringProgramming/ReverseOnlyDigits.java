package stringProgramming;

import java.util.Scanner;

public class ReverseOnlyDigits {

	public static String extractDigits(String str) {
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				s+=ch;
		}
		return s;
	}
	public static String reverse(String str) {
		String rev="";int index=0;
		String s=extractDigits(str);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				rev+=s.charAt(index++);
			else
				rev+=ch;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    System.out.println("Original string:"+str);
        System.out.println("Reversed string:"+reverse(str));
	}

}
