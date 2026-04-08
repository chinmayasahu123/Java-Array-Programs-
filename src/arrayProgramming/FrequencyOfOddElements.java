package arrayProgramming;

import java.util.Scanner;

public class FrequencyOfOddElements {

	public static int countOdd(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1)
				count++;
		}
		return count;
	}
	public static void printFrequencyOfOddElements(int arr[]) {
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=visited&&arr[i]%2==1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[i]==arr[j]&&arr[j]%2==1) {
						arr[j]=visited;
						count++;
					}
				}
				System.out.println("Element - "+arr[i]+" - Frequency = "+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
	    int count=countOdd(arr);
        if(count==0) {
        	System.out.println("No Odd Elements Present.");
        }
        else {
        	printFrequencyOfOddElements(arr);
        }
	}
}
