package stringSorting;

import java.util.Scanner;

public class VowelSortingAsc {

	public static char[] toCharArray(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static void sortVowels(char ch[]) {
		char val=Character.MIN_VALUE;
		for(int i=0;i<ch.length;i++) {
			if(isVowel(ch[i])) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]>ch[j]&&isVowel(ch[j])) {
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}
		}
	}
	public static String toString(char ch[]) {
		String str="";
		for(int i=0;i<ch.length;i++)
			str+=ch[i];
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    System.out.println("Before Sorting:"+str);
        char ch[]=toCharArray(str);
        sortVowels(ch);
        System.out.println("Afer sorting:"+toString(ch));

	}

}
