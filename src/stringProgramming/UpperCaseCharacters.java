package stringProgramming;

import java.util.Scanner;

public class UpperCaseCharacters {

	public static int printUpperCaseCharacters(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				if(count==0)
					System.out.println("UpperCase Characters:");
				System.out.print(ch+" ");
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    if(printUpperCaseCharacters(str)==0)
    	System.out.println("No uppercase characters.");
	}

}
