package matrices;

import java.util.Scanner;

public class ReverseEveryRow {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a row val:");
    int row=sc.nextInt();
    System.out.println("Enter a col val:");
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("Enter elements of matrix");
    for(int i=0;i<row;i++) {
    	for(int j=0;j<col;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    int brr[][]=new int[row][col];
    for(int i=0;i<row;i++) {
    	int index=0;
    	for(int j=arr[i].length-1;j>=0;j--) {
    		brr[i][index++]=arr[i][j];
    	}
    }
    for(int i=0;i<row;i++) {
    	for(int j=0;j<col;j++) {
    		System.out.print(brr[i][j]+" ");
    	}
    	System.out.println();
    }
	}

}
