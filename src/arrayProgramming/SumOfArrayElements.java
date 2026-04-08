package arrayProgramming;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter a elements");
    for(int i=0;i<size;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println(sumOfArray(arr));
	}

	public static int sumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
