package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotatingTheArrayNTimes {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value:");
    int n=sc.nextInt();
    int arr[]= {17,14,9,11};

    System.out.println(Arrays.toString(arr));
    leftRotateArrayNTimes(arr,n);
    System.out.println(Arrays.toString(arr));
	}

	public static void leftRotateArrayNTimes(int[] arr, int n) {
		for(int i=1;i<=n;i++) {
	    int temp=arr[0];
	    for(int j=0;j<arr.length-1;j++)
	    	arr[j]=arr[j+1];
	    arr[arr.length-1]=temp;
		}
	}

}
