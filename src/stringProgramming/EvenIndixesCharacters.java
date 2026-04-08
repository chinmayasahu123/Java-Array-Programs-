package stringProgramming;

import java.util.Scanner;

public class EvenIndixesCharacters {

	public static void printEvenIndicesCharacters(String str) {
		for(int i=0;i<str.length();i++) {
			if(i%2==0&&i!=0)
			System.out.println("'"+str.charAt(i)+"'");	
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    printEvenIndicesCharacters(str);
	}

}
