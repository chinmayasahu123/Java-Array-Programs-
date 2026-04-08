package multiWordStrings;

import java.util.Scanner;

public class SumOfDiagonalElementsAndNonDiagonalElements {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter row val:");
    int row=sc.nextInt();
    System.out.println("Enter col val:");
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("Enter elements:");
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    int diagonalSum=0;int nonDiagonalSum=0;
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		if(i==j||i+j==row-1)
    			diagonalSum+=arr[i][j];
    		else
    			nonDiagonalSum+=arr[i][j];
    	}
    }
    System.out.println("Diagonal Sum "+diagonalSum+" "+"Non diagonal Sum "+nonDiagonalSum);
	}

}
