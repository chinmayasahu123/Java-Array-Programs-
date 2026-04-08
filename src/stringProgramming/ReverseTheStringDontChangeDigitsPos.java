package stringProgramming;

import java.util.Scanner;

public class ReverseTheStringDontChangeDigitsPos {

	public static String extractStringInRevWithoutDigitsChars(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(!Character.isDigit(ch))
				rev+=ch;
		}
		return rev;
	}
	public static String reverseString(String str) {
		String rev=extractStringInRevWithoutDigitsChars(str);
		String reversedString="";int index=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isDigit(ch)) {
				reversedString+=rev.charAt(index);
				index++;
			}
			else
			  reversedString+=str.charAt(i);
		}
		return reversedString;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.next();
    System.out.println("Before reversed string:"+str);
    System.out.println("Reversed String:"+reverseString(str));
	}

}
