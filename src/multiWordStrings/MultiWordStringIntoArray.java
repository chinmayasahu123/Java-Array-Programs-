package multiWordStrings;

import java.util.Scanner;

public class MultiWordStringIntoArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a multiword string:");
    String str=sc.nextLine();
    String strs[]=str.split("a");
    System.out.println("\""+str+"\"");
    for(int i=0;i<strs.length;i++)
    	System.out.println(strs[i]);
	}

}
