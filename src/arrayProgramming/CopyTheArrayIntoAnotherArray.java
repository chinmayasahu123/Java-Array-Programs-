package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CopyTheArrayIntoAnotherArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Original array "+Arrays.toString(arr));
        copyTheArrayIntoAnotherArray(arr);
        
	}

	public static void copyTheArrayIntoAnotherArray(int[] arr) {
	int brr[]=new int[arr.length];
	int index=0;
	for(int i=arr.length-1;i>=0;i--)
		brr[index++]=arr[i];
	
	System.out.println("Copied array "+Arrays.toString(brr));
	}
}
