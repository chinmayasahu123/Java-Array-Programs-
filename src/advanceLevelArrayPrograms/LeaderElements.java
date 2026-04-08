package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class LeaderElements {

	public static void printLeaderElements(int arr[]) {
		System.out.println("Leader Elements are:");
		for(int i=0;i<arr.length-1;i++) {
			int max=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(max<arr[j])
					max=arr[j];
			}
			if(max==arr[i])
				System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length-1]);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a size:");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++)
    	arr[i]=sc.nextInt();
    System.out.println(Arrays.toString(arr));
    printLeaderElements(arr);
	}

}
