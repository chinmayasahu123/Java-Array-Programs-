package stringRotations;

import java.util.Scanner;

public class LeftRotateStringOnce {

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
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    String rotatedString=leftRotate(str);
	    System.out.println("Left rotated string is "+rotatedString);
	}

}
