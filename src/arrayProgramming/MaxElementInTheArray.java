package arrayProgramming;

import java.util.Scanner;

public class MaxElementInTheArray {
	public static int maxElement(int[] arr) {
	    int max = arr[0];
	    for(int i=1;i<arr.length;i++) {
	    	if(max<arr[i])
	    		max=arr[i];
	    }
	    return max;
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
		System.out.println("Maximum element present in the given array is "+maxElement(arr));
	}
}
