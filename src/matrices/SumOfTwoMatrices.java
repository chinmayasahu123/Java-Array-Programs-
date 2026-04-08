package matrices;

import java.util.Scanner;

public class SumOfTwoMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a 1st matrix row val:");
	    int row1=sc.nextInt();
	    System.out.println("Enter a 1st matrix col val:");
	    int col1=sc.nextInt();
	    int arr1[][]=new int[row1][col1];
	    System.out.println("enter 1st matrix elements:");
	    for(int i=0;i<arr1.length;i++) {
	    	for(int j=0;j<col1;j++) {
	    		arr1[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("Enter a 2nd matrix row val:");
	    int row2=sc.nextInt();
	    System.out.println("Enter a 2nd matrix col val:");
	    int col2=sc.nextInt();
	    int arr2[][]=new int[row2][col2];
	    System.out.println("enter 2nd matrix elements:");
	    for(int i=0;i<arr2.length;i++) {
	    	for(int j=0;j<col2;j++) {
	    		arr1[i][j]=sc.nextInt();
	    	}
	    }
        if(row1==row2&&col1==col2) {
        	int arr[][]=new int[row1][col1];
            for(int i=0;i<arr2.length;i++) {
    	    	for(int j=0;j<col2;j++) {
    	    		arr[i][j] = arr1[i][j] + arr2[i][j];
    	    	}
    	    }
            for(int i=0;i<arr.length;i++) {
    	    	for(int j=0;j<arr[i].length;j++) {
    	    		System.out.print(arr[i][j]+" ");
    	    	}
    	    	System.out.println();
    	    }
        }
        else
        	System.out.println("Not possible to add matrices");
	}

}
