package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeEvenFromThreeArrays {
	public static int countEven(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static void merge(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
		 int index=0;
		 for(int i=0;i<arr1.length;i++) {
			 if(arr1[i]%2==0)
				 arr4[index++]=arr1[i];
		 }
		 for(int i=0;i<arr2.length;i++) {
			 if(arr2[i]%2==0)
				 arr4[index++]=arr2[i];
		 }
		 for(int i=0;i<arr3.length;i++) {
			 if(arr3[i]%2==0)
				 arr4[index++]=arr3[i];
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
	    System.out.println("Enter the size of 3rd array");
	    int size3=sc.nextInt();
	    int arr3[]=new int[size3];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size3;i++) {
	    	arr3[i]=sc.nextInt();
	    }
	    int length=countEven(arr1)+countEven(arr2)+countEven(arr3);
	    int arr4[]=new int[length];
        merge(arr1,arr2,arr3,arr4);
        System.out.println("First array"+Arrays.toString(arr1));
        System.out.println("Second array"+Arrays.toString(arr2));
        System.out.println("Third array"+Arrays.toString(arr3));
        System.out.println("Merged array"+Arrays.toString(arr4));
	}


	
		
	}

	


