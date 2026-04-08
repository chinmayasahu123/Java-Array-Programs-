package arrayProgramming;

import java.util.Scanner;

public class Combination1 {
	public static void leftRotateTheArray(int[] arr) {
	int temp=arr[0];
	for(int i=0;i<arr.length-1;i++)
		arr[i]=arr[i+1];
	arr[arr.length-1]=temp;
	}

	public static int sumOfOddIndicesElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==1)
				sum+=arr[i];
		}
		return sum;
	}
	
	public static int sumOfEvenIndicesElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a array size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter a array elements:");
    for(int i=0;i<arr.length;i++)
    	arr[i]=sc.nextInt();
    int evenSum=sumOfEvenIndicesElements(arr);
    leftRotateTheArray(arr);
    int oddSum=sumOfOddIndicesElements(arr);
    if(evenSum==oddSum) {
    	System.out.println("Even and odd indices sum is equal.");
    }
    else
    	System.out.println("Even and odd indices sum is not equal.");
	}
}
