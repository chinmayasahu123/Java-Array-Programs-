package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayIntoTwoHalfsPrimeAndNonPrime {

	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static int countPrime(int []arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i]))
				count++;
		}
		return count;
	}
	public static void splitArray(int arr[],int brr[],int crr[]) {
		int index1=0;int index2=0;
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i]))
				brr[index1++]=arr[i];
			else
				crr[index2++]=arr[i];
		}
	}
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
       int primeCount=countPrime(arr);
       int nonPrimeCount=arr.length-primeCount;
       int brr[]=new int[primeCount];
       int crr[]=new int[nonPrimeCount];
       splitArray(arr,brr,crr);
       System.out.println("Prime sub array "+Arrays.toString(brr));
       System.out.println("Non prime sub array "+Arrays.toString(crr));
	}

}
