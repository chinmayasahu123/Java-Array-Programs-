package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Combination4 {

	public static void merge(int arr1[],int arr2[],int arr3[]) {
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		int index=arr1.length;
		for(int i=0;i<arr2.length;i++) {
			arr3[index++]=arr2[i];
		}
	}
	public static int countDuplicatesAndRemove(int arr[]) {
		int visited=Integer.MIN_VALUE;int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[j]==arr[i]) {
						arr[j]=visited;
					    count++;
					}
				}
			}
		}
		return count;
	}
	public static void subArrayWithoutDuplicates(int arr[],int brr[]) {
		int visited=Integer.MIN_VALUE;int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited)
				brr[index++]=arr[i];
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
	    int arr3[]=new int[arr1.length+arr2.length];
	    merge(arr1,arr2,arr3);

	    int brr[]=new int[arr3.length-countDuplicatesAndRemove(arr3)];
	    subArrayWithoutDuplicates(arr3,brr);
	    System.out.println(Arrays.toString(brr));
	}

}
