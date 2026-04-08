package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

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
    System.out.println("enter a array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
    int brr[]=new int[arr.length-countDuplicatesAndRemove(arr)];
    subArrayWithoutDuplicates(arr,brr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(brr));
	}

}
