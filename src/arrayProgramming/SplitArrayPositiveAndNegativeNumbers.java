package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayPositiveAndNegativeNumbers {

	public static int countPositive(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				count++;
		}
		return count;
	}
	public static void splitArray(int arr[],int brr[],int crr[]) {
		int index1=0;int index2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				crr[index2++]=arr[i];
			else
				brr[index1++]=arr[i];
		}
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
	    System.out.println(Arrays.toString(arr));
	    int posCount=countPositive(arr);
	    int negCount=arr.length-posCount;
	    int brr[]=new int[negCount];
	    int crr[]=new int[posCount];
	    splitArray(arr,brr,crr);
	    System.out.println(Arrays.toString(brr));
	    System.out.println(Arrays.toString(crr));
	}

}
