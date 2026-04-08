package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftPrimeElementsToTheBegining {

	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static void leftRotate(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=temp;
	}
	public static int movePrimeElements(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i])) {
				count++;
				leftRotate(arr,i);
				}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(arr));
        if(movePrimeElements(arr)==0)
        	System.out.println("No Prime Elements.");
        else
        	System.out.println(Arrays.toString(arr));
	}

}
