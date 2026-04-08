package arrayProgramming;

import java.util.Scanner;

public class SumOfEvenIndicesElements {

	public static int sumOfEvenIndicesElements(int [] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a size of the array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    	arr[i]=sc.nextInt();
    System.out.println("Sum of the elements of even indices is "+sumOfEvenIndicesElements(arr));
	}

}
