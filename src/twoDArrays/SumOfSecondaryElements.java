package twoDArrays;

import java.util.Scanner;

public class SumOfSecondaryElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a row val:");
	    int row=sc.nextInt();
	    System.out.println("Enter a col val:");
	    int col=sc.nextInt();
	    int arr[][]=new int[row][col];
	    System.out.println("enter elements:");
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<col;j++) {
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    int sum=0;
        for(int i=0;i<arr.length;i++) {
        	sum+=arr[i][row-1-i];
        }
        System.out.println("Sum of secondary elements is "+sum);
	}

}
