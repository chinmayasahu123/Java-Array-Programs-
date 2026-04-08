package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SortingPrimeElements {

	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static void sortingPrime(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(checkPrime(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(checkPrime(arr[j])&&arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
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
	    for(int i=0;i<size;i++) 
	    	arr[i]=sc.nextInt();
	    System.out.println("Before sorting tha array is "+Arrays.toString(arr));
	    sortingPrime(arr);
	    System.out.println("After sorting the array is "+Arrays.toString(arr));

	}

}
