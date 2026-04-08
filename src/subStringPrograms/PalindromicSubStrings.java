package subStringPrograms;

import java.util.Scanner;

public class PalindromicSubStrings {

	public static String reverse(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--)
			res+=str.charAt(i);
		return res;
	}
	public static boolean checkPalindrome(String str) {
		if(str.equals(reverse(str)))
			return true;
		return false;
	}
	public static void printPalindromicSubStrings(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			String ch=str.charAt(i)+"";
			System.out.println("\""+ch+"\"");
			res=ch;
			for(int j=i+1;j<str.length();j++) {
				res+=str.charAt(j);
				if(checkPalindrome(res))
					System.out.println("\""+res+"\"");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    printPalindromicSubStrings(str);
	}

}
