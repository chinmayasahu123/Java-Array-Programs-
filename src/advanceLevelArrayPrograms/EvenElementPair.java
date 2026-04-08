package advanceLevelArrayPrograms;

import java.util.Scanner;

public class EvenElementPair {

	public static int evenElementPair(int arr[],int val) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]%2==0&&arr[i]+arr[j]>val) {
					if(count==0)
						System.out.println("Even element pairs:");
					System.out.println("("+arr[i]+","+arr[j]+")");
					count++;
				}
			}
		}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a size of the arr:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter an array elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
	    System.out.println("Enter a value:");
        int val=sc.nextInt();
        if(evenElementPair(arr,val)==0) {
        	System.out.println("No even element pairs.");
        }
	}

}
