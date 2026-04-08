package matrices;

import java.util.Scanner;

public class TransponseMatrix {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter row value:");
    int row=sc.nextInt();
    System.out.println("Enter col value:");
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    int brr[][]=new int[col][row];
    for(int i=0;i<brr.length;i++) {
    	for(int j=0;j<brr[i].length;j++) {
    		brr[i][j]=arr[j][i];
    	}
    }
    for(int i=0;i<brr.length;i++) {
    	for(int j=0;j<brr[i].length;j++) {
    		System.out.print(brr[i][j]+" ");
    	}
    	System.out.println();
    }
	}

}
