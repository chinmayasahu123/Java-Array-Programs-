package multiWordStrings;

import java.util.Arrays;
import java.util.Scanner;

public class CustomSplitMethod {

	public static int countNoOfDelimeter(String str,char delimeter) {
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==delimeter)
				count++;
		}
		return count;
	}
	public static String[] split(String str,char delimeter) {
		int count=countNoOfDelimeter(str,delimeter);
		String res[]=new String[count];String st="";int index=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==delimeter) {
				res[index++]=st;
				st="";
			}
			else {
				st+=ch;
			}
			if(str.length()-1==i)
				res[index]=st;
		}
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    System.out.println("Enter a delimeter:");
    char delimeter=sc.next().charAt(0);
    String res[]=split(str,delimeter);
    System.out.println(Arrays.toString(res));
	}

}
