package stringProgramming;

import java.util.Scanner;

public class removeDuplicates {

	public static int removeDuplicates(char arr[]) {
		int count=0;char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ch) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&arr[j]!=ch) {
					arr[j]=ch;
					count++;
				}
			}
		}
		}
		return count;
	}
	public static String toString(char arr[]) {
		char ch=Character.MIN_VALUE;String str="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ch) {
			 str+=arr[i];
			}
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    System.out.println("Original String:"+str);
        char ch[]=str.toCharArray();
        int count=removeDuplicates(ch);
        if(count==0)
        	System.out.println("After remove duplicates:"+str);
        else {
        	System.out.println("After remove duplicates:"+toString(ch));
        }
	}

}
