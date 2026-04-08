package matrices;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter row val:");
    int row=sc.nextInt();
    System.out.println("Enter col val:");
    int col=sc.nextInt();
    System.out.println("Enter elements:");
    int arr[][]=new int[row][col];
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    int countZero=0;int countNonZero=0;
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[i].length;j++) {
    		int num = arr[i][j];
    		if(num==0)
    			countZero++;
    		else
    			countNonZero++;
    	}
    }
    if(countNonZero<countZero)
    	System.out.println("Given matrice is sparse matrix.");
    else
    	System.out.println("Given matrice is not a sparse matrix.");
	}

}
