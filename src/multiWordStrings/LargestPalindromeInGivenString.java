package multiWordStrings;

import java.util.Scanner;

public class LargestPalindromeInGivenString {

	public static String reverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);
		return rev;
	}
	public static boolean checkPalindrome(String str) {
		if(str.equalsIgnoreCase(reverse(str)))
			return true;
		return false;
	}
	public static String findLongestPalindrom(String strs[]) {
		String str="";
		for(int i=0;i<strs.length;i++) {
			if(str.length()<strs[i].length()&&checkPalindrome(strs[i]))
				str=strs[i];
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.nextLine();
        String strs[]=str.split(" ");
        String res=findLongestPalindrom(strs);
        if(res.isEmpty())
        	System.out.println("No palindromes are present in given string.");
        else
        	System.out.println("Largest Palindrome:"+res);
	}

}
