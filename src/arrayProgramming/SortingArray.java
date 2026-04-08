package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
	
	public static void sortingArray(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {// j is checking 1 step ahead of i thats why its i+1
				if(arr[i]>arr[j]) { // it check i` bigger than the number at position `j`
					// The bigger number should NOT be before the smaller one
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
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
        sortingArray(arr);
        System.out.println(Arrays.toString(arr));
	}

}
