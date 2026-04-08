package stringProgramming;

import java.util.Scanner;

public class RemoveDuplicateConsonants {

	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
	}
	public static char[] toCharArray(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static int removeConsonants(char arr[]) {
		int count=0;char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ch&&!isVowel(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=ch&&arr[i]==arr[j]&&!isVowel(arr[j])) {
						count++;
						arr[j]=ch;
					}
				}
			}
		}
		return count;
	}
	public static String toString(char arr[]) {
		String str="";char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ch)
				str+=arr[i];
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    System.out.println(str);
        char ch[]=toCharArray(str);
        int count=removeConsonants(ch);
        if(count==0)
        	System.out.println(str);
        else
        	System.out.println(toString(ch));
	}

}
