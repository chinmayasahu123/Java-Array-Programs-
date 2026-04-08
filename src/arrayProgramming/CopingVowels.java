package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CopingVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    char arr[]=new char[size];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.next().charAt(0);
	    }

	    System.out.println("Original array "+Arrays.toString(arr));
	    int count=countVowels(arr);
	    if(count>0) {
	    	char brr[]=copingVowels(arr,count);
	    	System.out.println("Vowels array"+Arrays.toString(brr));
	    }
	    else {
	    	System.out.println("No vowels present int the given array.");
	    }
	}
	public static char[] copingVowels(char[] arr,int count) {
		char brr[]=new char[count];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(checkVowel(arr[i]))
				brr[index++]=arr[i];
		}
		return brr;
	}
	public static boolean checkVowel(char ch) {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
		   ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		return false;
	}
	public static int countVowels(char []arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(checkVowel(arr[i]))
				count++;
		}
		return count;
	}
}
