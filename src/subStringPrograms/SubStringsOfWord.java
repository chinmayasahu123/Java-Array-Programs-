package subStringPrograms;

import java.util.Scanner;

public class SubStringsOfWord {

	public static void printSubStrings(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			String ch=str.charAt(i)+"";
			System.out.println("\""+ch+"\"");
			res=ch;
			for(int j=i+1;j<str.length();j++) {
				res+=str.charAt(j);
				System.out.println("\""+res+"\"");
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    printSubStrings(str);
	}

}
