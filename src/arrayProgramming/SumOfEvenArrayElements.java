package arrayProgramming;

import java.util.Scanner;

public class SumOfEvenArrayElements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size:");
    int size=sc.nextInt();int arr[]=new int[size];
    for(int i=0;i<size;i++)
    	arr[i]=sc.nextInt();
    System.out.println(sumOfEvenArrayElements(arr));
	}

	public static int sumOfEvenArrayElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
			sum+=arr[i];
		}
		return sum;
	}

}
