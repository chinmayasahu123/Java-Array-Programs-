package twoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sample2DProgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no.of rows:");
	int row=sc.nextInt();
	System.out.println("Enter a no.of cols:");
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter a element for "+i+" , "+j);
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}
