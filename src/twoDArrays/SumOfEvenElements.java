package twoDArrays;

import java.util.Scanner;

public class SumOfEvenElements {

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
		int evenSum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int num=arr[i][j];
				if(num%2==0)
					evenSum+=num;
			}
		}
        System.out.println("Sum of the even elements present in the arr is "+evenSum);
	}

}
