package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateTheArrayNTimes {
      

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value:");
    int n=sc.nextInt();
    int arr[]= {17,14,9,11};

    System.out.println(Arrays.toString(arr));
    rightRotateArrayNTimes(arr,n);
    System.out.println(Arrays.toString(arr));
	}

	public static void rightRotateArrayNTimes(int[] arr, int n) {
		for(int i=1;i<=n;i++) {
	    int temp=arr[arr.length-1];
	    for(int j=arr.length-1;j>0;j--)
	    	arr[j]=arr[j-1];
	    arr[0]=temp;
		}
	}

}
