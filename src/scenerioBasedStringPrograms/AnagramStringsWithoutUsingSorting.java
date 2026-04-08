package scenerioBasedStringPrograms;

import java.util.Scanner;

public class AnagramStringsWithoutUsingSorting {

	public static boolean checkAnagram(String str1,String str2) {
		if(str1.length()==str2.length()) {
			int freq[]=new int[26];
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			for(int i=0;i<str1.length();i++) {
				char ch1=str1.charAt(i);
				freq[ch1-'a']++;
				char ch2=str2.charAt(i);
				freq[ch2-'a']--;
			}
			boolean cond=true;
			for(int i=0;i<26;i++) {
				if(freq[i]!=0) {
					cond=false;
					break;
				}
			}
			return cond;
		}
		else
			return false;
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a 1st string:");
    String str1=sc.next();
    System.out.println("Enter a 2nd string:");
    String str2=sc.next();
    if(checkAnagram(str1,str2))
    	System.out.println(str1+" and "+str2+" are anagrams strings");
    else
    	System.out.println(str1+" and "+str2+" are not anagrams strings");
	}

}
