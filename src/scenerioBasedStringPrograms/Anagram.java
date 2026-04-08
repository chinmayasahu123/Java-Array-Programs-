package scenerioBasedStringPrograms;

import java.util.Scanner;

public class Anagram {

	public static char[] toCharArray(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static void sortArray(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static String toString(char ch[]) {
		String str="";
		for(int i=0;i<ch.length;i++)
			str+=ch[i];
		return str;
	}
	public static boolean equals(String str1,String str2) {
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a strings:");
    String str1=sc.next();
    String str2=sc.next();
    if(str1.length()==str2.length()) {
    	char ch1[]=toCharArray(str1);
    	char ch2[]=toCharArray(str2);
    	sortArray(ch1);
    	sortArray(ch2);
    	if(equals(toString(ch1),toString(ch2)))
    		System.out.println("Given strings are anagrams.");
    	else
    		System.out.println("String are not anagrams.");
    }
    else
    	System.out.println("String are not anagrams.");
	}

}
