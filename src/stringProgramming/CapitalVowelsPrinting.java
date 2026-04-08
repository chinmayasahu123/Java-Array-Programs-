package stringProgramming;

import java.util.Scanner;

public class CapitalVowelsPrinting {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static int printVowelCapital(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='A'&&ch<='Z')&&isVowel(ch)) {
				if(count==0)
					System.out.println("Capital vowel characters:");
				System.out.println("'"+ch+"'");
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    if(printVowelCapital(str)==0){
    	System.out.println("No capital vowels.");
    }
	}

}
