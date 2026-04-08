package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class NthLargest {
	public static int countDuplicats(int arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			int visited= Integer.MIN_VALUE;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]!=visited && arr[i]==arr[j]) {
					arr[j]=visited;
					count++;
				}
				
			}
			
		}
		return count;
	}
	public static void RemoveDuplicats(int arr[],int [] brr) {
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			int visited= Integer.MIN_VALUE;
			if(arr[i]!=visited) {
			   brr[index++]=arr[i];
			}
		}
		
	}
    public static void arraySorting(int []arr) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {5,4,2,3,6,4,12,8};
	System.out.println("Enter the n value.....");
	int n=sc.nextInt();
	System.out.println(Arrays.toString(arr));
	int count=arr.length-countDuplicats(arr);
	int brr[]=new int[count];
	RemoveDuplicats(arr,brr);
	arraySorting(brr);
	System.out.println(Arrays.toString(brr));
    if(n>brr.length) {
	System.out.println("There is no "+n+"th largest number in the array.");
    }
    else
	System.out.println(n+"th largest number is "+brr[n-1]);
	
  }
}
