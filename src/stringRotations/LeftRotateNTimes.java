package stringRotations;

import java.util.Scanner;

public class LeftRotateNTimes {


	public static String leftRotate(String str) {
		String rotatedString="";
		for(int i=1;i<str.length();i++) {
			rotatedString+=str.charAt(i);
		}
		rotatedString+=str.charAt(0);
		return rotatedString;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter string:");
	    String str=sc.next();
	    System.out.println("Enter n times:");
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++) {
	    str=leftRotate(str);
	    }
	    System.out.println(n+" times Left rotated string is "+str);
	}
}
