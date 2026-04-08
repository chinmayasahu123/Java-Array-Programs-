package stringSorting;

import java.util.Scanner;

public class SortTheString {

	public static char[] toCharArray(String str) {
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[i]=str.charAt(i);
		return ch;
	}
	public static void sortArray(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static String toString(char ch[]) {
		String str="";
		for(int i=0;i<ch.length;i++) {
			str+=ch[i];
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    System.out.println("Before Sorting:"+str);
        char ch[]=toCharArray(str);
        sortArray(ch);
        System.out.println("Afer sorting:"+toString(ch));
	}

}
