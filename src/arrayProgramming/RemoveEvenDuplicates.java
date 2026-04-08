package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenDuplicates {

	public static int countAndRemoveEvenDuplicates(int arr[]) {
		int visited=Integer.MIN_VALUE;int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited&&arr[i]%2==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[j]==arr[i]&&arr[j]%2==0) {
						arr[j]=visited;
					    count++;
					}
				}
			}
		}
		return count;
	}
	public static void subArrayAfterRemoveDuplicates(int arr[],int brr[]) {
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
	int count=countAndRemoveEvenDuplicates(arr);
	int brr[]=new int[arr.length-count];
	subArrayAfterRemoveDuplicates(arr,brr);
	System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(brr));
	}

}
