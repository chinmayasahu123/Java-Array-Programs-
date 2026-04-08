package subStringPrograms;

import java.util.Scanner;

public class CustomSubString {

	public static String subString(int indexStart,String str) {
		if(indexStart<str.length()) {
			String res="";
			for(int i=indexStart;i<str.length();i++) {
				res+=str.charAt(i);
			}
			return res;
		}
		else
			return "Index is not present.";
	}
	public static String subString(int indexStart,int indexEnd,String str) {
		if(indexStart<str.length()&&indexEnd<str.length()) {
			String res="";
			for(int i=indexStart;i<indexEnd;i++) {
				res+=str.charAt(i);
			}
			return res;
		}
		else
			return "Index is not present.";
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string :");
    String str=sc.next();
    System.out.println(subString(3,4,str));
    System.out.println(subString(4,str));
	}

}
