package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CopingEvenElementsIntoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
        int count=countTheEvenElements(arr);
        System.out.println("Original array "+Arrays.toString(arr));
        if(count!=0) {
        	int brr[]=copingEvenElements(arr,count);
        	System.out.println("Original array "+Arrays.toString(brr));
        }
        else
        	System.out.println("Even elemnts are zero.");
        
        
	}

	public static int[] copingEvenElements(int[] arr,int count) {
		int brr[]=new int[count];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				brr[index++]=arr[i];
		}
		return brr;
	}

	public static int countTheEvenElements(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
		
	}

}
