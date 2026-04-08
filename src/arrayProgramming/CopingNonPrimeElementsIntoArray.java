package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CopingNonPrimeElementsIntoArray {
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
	    int count=countNonPrimeElements(arr);
	    if(count>0) {
	    	int brr[]=copingNonPrimeElements(arr,count);
	    	System.out.println("Non-Prime elements array"+Arrays.toString(brr));
	    }
	    else {
	    	System.out.println("No non-prime numbers present int the given array.");
	    }
	}
	public static int[] copingNonPrimeElements(int[] arr,int count) {
		int brr[]=new int[count];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(!checkPrime(arr[i]))
				brr[index++]=arr[i];
		}
		return brr;
	}
	public static int countNonPrimeElements(int []arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(!checkPrime(arr[i]))
				count++;
		}
		return count;
	}
	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
}
