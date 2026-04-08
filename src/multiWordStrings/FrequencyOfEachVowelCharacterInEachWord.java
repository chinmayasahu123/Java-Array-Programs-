package multiWordStrings;

import java.util.Scanner;

public class FrequencyOfEachVowelCharacterInEachWord {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static void printFrequencyOfEachVowelChar(char ch[]) {
		char minCh=Character.MIN_VALUE;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=minCh&&isVowel(ch[i])) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[j]!=minCh&&ch[i]==ch[j]&&isVowel(ch[j])) {
						ch[j]=minCh;
						count++;
					}
				}
				System.out.println("'"+ch[i]+"' - "+count);
			}
		}
	}
	public static void printWordAndVowelChars(String strs[]) {
		for(int i=0;i<strs.length;i++) {
			System.out.println("\""+strs[i]+"\"");
			char ch[]=strs[i].toCharArray();
			printFrequencyOfEachVowelChar(ch);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.nextLine();
	    String strs[]=str.split(" ");
	    printWordAndVowelChars(strs);
	}
}
