package stringProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharacterArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    char ch[]=str.toCharArray();
        System.out.println(Arrays.toString(ch));
	}

}
