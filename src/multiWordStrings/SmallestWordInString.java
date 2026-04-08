package multiWordStrings;

import java.util.Scanner;

public class SmallestWordInString {

	public static String smallestWord(String strs[]) {
		String smallest=strs[0];
		for(int i=1;i<strs.length;i++) {
			if(smallest.length()>strs[i].length())
				smallest=strs[i];
		}
		return smallest;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    String[] strs=str.split(" ");
    System.out.println("Smallest word:"+smallestWord(strs));
	}

}
