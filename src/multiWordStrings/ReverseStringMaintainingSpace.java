package multiWordStrings;

import java.util.Scanner;

public class ReverseStringMaintainingSpace {

	public static String removeSpaceExtractCharacters(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch!=' ')
				rev+=ch;
		}
		return rev;
	}
	public static String reverseString(String str) {
		String rev=removeSpaceExtractCharacters(str);
		String res="";int index=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ')
				res+=ch;
			else
				res+=rev.charAt(index++);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string :");
	    String str=sc.nextLine();
	    System.out.println("Original string:"+str);
	    System.out.println("Reversed String:"+reverseString(str));
	}

}
