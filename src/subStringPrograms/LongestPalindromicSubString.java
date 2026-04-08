package subStringPrograms;

import java.util.Scanner;

public class LongestPalindromicSubString {

	public static String reverse(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--)
			res+=str.charAt(i);
		return res;
	}
	public static boolean checkPalindrome(String str) {
		if(str.equalsIgnoreCase(reverse(str)))
			return true;
		return false;
	}
	public static String longestPalindromicSubString(String str) {
		String res=str.charAt(0)+"";
		String st="";
		for(int i=0;i<str.length();i++) {
			st=str.charAt(i)+"";
			for(int j=i+1;j<str.length();j++) {
				st+=str.charAt(j);
				if(checkPalindrome(st)) {
					if(res.length()<st.length())
						res=st;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    System.out.println(longestPalindromicSubString(str));
	}

}
