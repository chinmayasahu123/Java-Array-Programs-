package stringProgramming;

import java.util.Scanner;

public class SpecialCharactersPrinting {

	public static int printSpecialCharacters(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!(ch>='A'&&ch<='Z')&&!(ch>='a'&&ch<='z')&&!(ch>='0'&&ch<='9')) {
				if(count==0)
					System.out.println("Special Characters:");
				System.out.println("'"+ch+"'");
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    if(printSpecialCharacters(str)==0)
    	System.out.println("No special characters.");
	}

}
