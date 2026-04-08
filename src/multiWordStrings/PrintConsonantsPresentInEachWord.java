package multiWordStrings;

import java.util.Scanner;

public class PrintConsonantsPresentInEachWord {

	public static boolean isConsonant(char ch) {
		return !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
	}
	public static void printConsonants(String str) {
		String strs[]=str.split(" ");
		for(int i=0;i<strs.length;i++) {
			System.out.println("Consonants in \""+strs[i]+"\"");
			for(int j=0;j<strs[i].length();j++) {
				if(isConsonant(strs[i].charAt(j)))
				System.out.println("'"+strs[i].charAt(j)+"'");
			}
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    printConsonants(str);
	}
}
