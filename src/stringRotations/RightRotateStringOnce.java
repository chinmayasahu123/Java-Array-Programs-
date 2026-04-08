package stringRotations;

import java.util.Scanner;

public class RightRotateStringOnce {
	public static String rightRotate(String str) {
		String rotatedString="";
		rotatedString+=str.charAt(str.length()-1);
		for(int i=0;i<str.length()-1;i++) {
			rotatedString+=str.charAt(i);
		}
		
		return rotatedString;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    String rotatedString=rightRotate(str);
	    System.out.println("Right rotated string is "+rotatedString);
	}
}
