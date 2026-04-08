package arrayProgramming;

import java.util.Scanner;

public class SumOfThePrimeNumberInTheArray {

	public static int sumOfPrimeElements(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i]))
				sum+=arr[i];
		}
		return sum;
	}
	public static boolean checkPrime(int ele) {
		int count=0;
		for(int i=1;i<=ele;i++) {
			if(ele%i==0)
				count++;
		}
		return count==2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a size of the array:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++)
	    	arr[i]=sc.nextInt();
	    System.out.println("Sum of the prime elements is "+sumOfPrimeElements(arr));

	}

}
