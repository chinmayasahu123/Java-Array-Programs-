package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SortingEvenNumber {

	public static void sortingEvenElements(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]&&arr[i]%2==0&&arr[j]%2==0) {
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
	    for(int i=0;i<size;i++) 
	    	arr[i]=sc.nextInt();
	    System.out.println("Before sorting even elements array is "+Arrays.toString(arr));
	    sortingEvenElements(arr);
        System.out.println("After sorting even elements array is "+Arrays.toString(arr));
	}

}
