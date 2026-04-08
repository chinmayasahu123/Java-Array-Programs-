package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeEvenNumberOnly {

	public static int countEvenElements(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static void merge(int arr1[],int arr2[],int arr3[]) {
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0)
				arr3[index++]=arr1[i];
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr2[i]%2==0)
				arr3[index++]=arr2[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of 1st array");
	    int size1=sc.nextInt();
	    int arr1[]=new int[size1];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size1;i++) {
	    	arr1[i]=sc.nextInt();
	    }
	    System.out.println("Enter the size of 2nd array");
	    int size2=sc.nextInt();
	    int arr2[]=new int[size2];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size2;i++) {
	    	arr2[i]=sc.nextInt();
	    }
        int evenElementsCount=countEvenElements(arr1)+countEvenElements(arr2);
        int arr3[]=new int[evenElementsCount];
        merge(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
	}

}
