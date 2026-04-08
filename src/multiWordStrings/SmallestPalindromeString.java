package multiWordStrings;

import java.util.Scanner;

public class SmallestPalindromeString {

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
	public static String smallestStrng(String strs[]) {
		String smallestPalindrome="";
		for(int i=0;i<strs.length;i++) {
			if(checkPalindrome(strs[i])&&(smallestPalindrome.length()==0||smallestPalindrome.length()>strs[i].length())){
				smallestPalindrome=strs[i];
			}
		}
		return smallestPalindrome;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.nextLine();
        String strs[]=str.split(" ");
        String res=smallestStrng(strs);
        if(res.isEmpty())
        	System.out.println("No palindromes are present in the given string.");
        else
        	System.out.println("Smallest Palindrome:"+res);
	}

}
