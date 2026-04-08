package arrayProgramming;

import java.util.Arrays;

public class LeftRotationOfArray {

	public static void main(String[] args) {
	int arr[]= {10,20,30};
    leftRotate(arr);
    System.out.println(Arrays.toString(arr));
	}

	public static void leftRotate(int[] arr) {
	int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	arr[arr.length-1]=temp;
	}

}
