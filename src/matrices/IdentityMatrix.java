package matrices;

import java.util.Scanner;

public class IdentityMatrix {

	public static boolean checkIndentityMatrix(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int num=arr[i][j];
				if(i==j&&num!=1)
					return false;
				else if(i!=j&&num!=0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a row val:");
    int row=sc.nextInt();
    System.out.println("Enter a col val:");
    int col=sc.nextInt();
    int arr[][]=new int[row][col];
    for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
    if(checkIndentityMatrix(arr))
    	System.out.println("The given matrix is identity matrix.");
    else
    	System.out.println("The given matrix is not a identity matrix.");
	}

}
