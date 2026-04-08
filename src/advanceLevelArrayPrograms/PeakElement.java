package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PeakElement {

	public static void printPeakElements(int arr[]) {
		System.out.println("Peak Elements:");
		if(arr[0]>arr[1])
			System.out.println(arr[0]);
		for(int i=1;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
					System.out.println(arr[i]);
		}
		if(arr[arr.length-1]>arr[arr.length-2])
			System.out.println(arr[arr.length-1]);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a size:");
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    System.out.println("Enter array elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
	    System.out.println(Arrays.toString(arr));
	    printPeakElements(arr);

	}

}
