package stringProgramming;

import java.util.Scanner;

public class PrintVowels {

	public static int printVowels(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				if(count==0)
					System.out.println("Vowels are:");
				System.out.println(str.charAt(i));
				count++;
			}
		}
		return count;
	}
	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    if(printVowels(str)==0) 
     System.out.println("There is no vowels present in the given string.");
	}

}
