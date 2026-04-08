package multiWordStrings;

import java.util.Scanner;

public class LargestWordInString {

	public static String largestWord(String strs[]) {
		String largest=strs[0];
		for(int i=1;i<strs.length;i++) {
			if(largest.length()<strs[i].length())
				largest=strs[i];
		}
		return largest;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    String strs[]=str.split(" ");
    System.out.println("\""+largestWord(strs)+"\"");
	}

}
