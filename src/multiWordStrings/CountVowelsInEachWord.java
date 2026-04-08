package multiWordStrings;

import java.util.Scanner;

public class CountVowelsInEachWord {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static int countVowels(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i)))
				count++;
		}
		return count;
	}
	public static void printVowelsCount(String str) {
		String strs[]=str.split(" ");
		for(int i=0;i<strs.length;i++)
			System.out.println("Word:"+strs[i]+" vowelcount:"+countVowels(strs[i]));
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    printVowelsCount(str);
	}
}
