package stringProgramming;

import java.util.Scanner;

public class PrintDigits {

	public static int printDigits(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9') {
				if(count==0)
					System.out.println("Digits present in the string are:");
				System.out.print("'"+ch+"'"+" ");
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    if(printDigits(str)==0)
    	System.out.println("No digits present.");
	}

}
