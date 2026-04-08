package multiWordStrings;

import java.util.Scanner;

public class PalindromesInString {

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
	public static void printPalindromes(String strs[]) {
		for(int i=0;i<strs.length;i++) {
			if(checkPalindrome(strs[i]))
				System.out.println("\""+strs[i]+"\"");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string :");
    String str=sc.nextLine();
    String strs[]=str.split(" ");
    printPalindromes(strs);
	}

}
