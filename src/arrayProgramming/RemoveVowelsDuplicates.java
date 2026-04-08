package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveVowelsDuplicates {

	public static boolean checkVowel(char ch) {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
		   ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		return false;
	}
	public static int countVowels(char arr[]) {
		int count=0;char ch=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(checkVowel(arr[i])) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]&&checkVowel(arr[j])) {
				 arr[j]=ch;
				 count++;
			 }
		 }
		}
		}
		return count;
	}
	public static void subArray(char arr[],char brr[]) {
		char ch=Character.MIN_VALUE;int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=ch)
				brr[index++]=arr[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a array size:");
	    int n=sc.nextInt();
	    char arr[]=new char[n];
	    System.out.println("Enter array elements:");
	    for(int i=0;i<n;i++)
	    	arr[i]=sc.next().charAt(0);
	    int count=countVowels(arr);
	    char brr[]=new char[arr.length-count];
	    System.out.println(Arrays.toString(arr));
	    subArray(arr,brr);
        
        System.out.println(Arrays.toString(brr));
	}

}
