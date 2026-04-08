package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumArray {

	public static void prefixSumArray(int arr[],int prefixSum[]) {
		for(int i=0;i<arr.length;i++) {
			int prefixSum1=arr[i];
			for(int j=i-1;j>=0;j--) {
				prefixSum1+=arr[j];
			}
			prefixSum[i]=prefixSum1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a size:");
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter array elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
	    int prefixSum[]=new int[n];
	    prefixSumArray(arr,prefixSum);
	    System.out.println(Arrays.toString(arr));
	    System.out.println(Arrays.toString(prefixSum));
	}

}
