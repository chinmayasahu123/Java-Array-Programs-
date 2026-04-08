package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeroesToTheEnd {

	public static void rotateLeft(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	public static int moveZeroes(int arr[]) {
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==0) {
				rotateLeft(arr,i);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(arr));
	    if(moveZeroes(arr)==0)
	    	System.out.println("No zeroes present.");
	    else
	    	System.out.println(Arrays.toString(arr));
	}

}
