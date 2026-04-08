package matrices;

import java.util.Scanner;

public class RotateMatrix90AntiClockWise {

	public static int[][] reverse(int arr[][]){
		int brr[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
	    	int index=0;
	    	for(int j=arr[i].length-1;j>=0;j--) {
	    		brr[i][index++]=arr[i][j];
	    	}
	    }
		return brr;
	}
    public static int[][] transpose(int arr[][]){
    	int brr[][]=new int[arr[0].length][arr.length];
    	for(int i=0;i<brr.length;i++) {
	    	for(int j=0;j<brr[i].length;j++) {
	    		brr[i][j]=arr[j][i];
	    	}
	    }
		return brr;
	}
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
	    int brr[][]=transpose(reverse(arr));
        for(int i=0;i<brr.length;i++) {
        	for(int j=0;j<brr[i].length;j++) {
        		System.out.print(brr[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
