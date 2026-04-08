package multiWordStrings;

import java.util.Scanner;

public class ReverseEachWord {

	public static String reverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);
		return rev;
	}
	public static String printWordInReverse(String strs[]) {
		String res="";
		for(int i=0;i<strs.length;i++) {
			res+=reverse(strs[i])+" ";
		}
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a multi word string:");
    String str=sc.nextLine();
    String strs[]=str.split(" ");
    System.out.println(printWordInReverse(strs));
	} 

}
