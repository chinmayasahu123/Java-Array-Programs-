package stringFrequency;

import java.util.Scanner;

public class ConsonantsFrequency {

	public static boolean isConsonant(char ch) {
		return !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				 ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
	}
	public static char[] toCharArray(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static void consonantsFrequency(char arr[]) {
		char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ch&&isConsonant(arr[i])) {
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]&&arr[j]!=ch&&isConsonant(arr[j])) {
						count++;
						arr[j]=ch;
					}
				}
				System.out.println(arr[i]+"->"+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
		char ch[]=toCharArray(str);
		consonantsFrequency(ch);

	}

}
