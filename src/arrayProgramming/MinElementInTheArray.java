package arrayProgramming;

import java.util.Scanner;

public class MinElementInTheArray {
	
    public static int minElement(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		return min;
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
        System.out.println("Minimum element present in the given array is "+minElement(arr));

	}

	

}
