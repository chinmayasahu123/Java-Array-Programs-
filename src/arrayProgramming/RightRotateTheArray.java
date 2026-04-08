package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateTheArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int arr[]= {6,3,4,7,1};
    System.out.println(Arrays.toString(arr));
    rightRotateTheArray(arr);
    System.out.println(Arrays.toString(arr));
	}

	public static void rightRotateTheArray(int[] arr) {
	int temp=arr[arr.length-1];
	for(int i=arr.length-1;i>0;i--) {
		arr[i]=arr[i-1];
	}
	arr[0]=temp;	
	}

}
