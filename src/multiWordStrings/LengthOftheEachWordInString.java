package multiWordStrings;

import java.util.Scanner;

public class LengthOftheEachWordInString {

	public static int count(String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
			count++;
		return count;
	}
	public static void printWordsCount(String str) {
		String strs[]=str.split(" ");
		for(int i=0;i<strs.length;i++)
			System.out.println("Word:"+strs[i]+" length:"+count(strs[i]));
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    printWordsCount(str);
	}

}
