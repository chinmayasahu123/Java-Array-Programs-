package matrices;

import java.util.Scanner;

public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter a 1st matrix row val:");
//	    int row1=sc.nextInt();
//	    System.out.println("Enter a 1st matrix col val:");
//	    int col1=sc.nextInt();
//	    int arr1[][]=new int[row1][col1];
//	    System.out.println("enter 1st matrix elements:");
//	    for(int i=0;i<arr1.length;i++) {
//	    	for(int j=0;j<col1;j++) {
//	    		arr1[i][j]=sc.nextInt();
//	    	}
//	    }
//	    System.out.println("Enter a 2nd matrix row val:");
//	    int row2=sc.nextInt();
//	    System.out.println("Enter a 2nd matrix col val:");
//	    int col2=sc.nextInt();
//	    int arr2[][]=new int[row2][col2];
//	    System.out.println("enter 2nd matrix elements:");
//	    for(int i=0;i<arr2.length;i++) {
//	    	for(int j=0;j<col2;j++) {
//	    		arr1[i][j]=sc.nextInt();
//	    	}
//	    }
	    int arr1[][]= {{1,2},{1,2}};
	    int arr2[][]= {{1,2},{1,2}};
	    int arr3[][]=new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++) {
        	for(int j=0;j<arr2[i].length;j++) {
        		for(int k=0;k<arr2.length;k++) {
        			arr3[i][j]=arr3[i][j]+(arr1[i][k]*arr2[k][j]);
        		}
        	}
        }
        for(int i=0;i<arr3.length;i++) {
	    	for(int j=0;j<arr3[i].length;j++) {
	    		System.out.print(arr3[i][j]+" ");
	    	}
	    	System.out.println();
	    } 
	}

}
