package stringProgramming;

import java.util.Scanner;

public class PrintCharactersInReverseOrder {

	public static void printCharactersInReverseOrder(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println("'"+str.charAt(i)+"'");	
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    printCharactersInReverseOrder(str);
	}

}
