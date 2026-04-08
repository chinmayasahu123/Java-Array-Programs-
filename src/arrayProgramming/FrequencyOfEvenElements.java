package arrayProgramming;

import java.util.Scanner;

public class FrequencyOfEvenElements {

	public static int countEven(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static void printFrequencyOfEvenElements(int arr[]) {
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=visited&&arr[i]%2==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[i]==arr[j]&&arr[j]%2==0) {
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
	    int count=countEven(arr);
        if(count==0) {
        	System.out.println("No Even Elements Present.");
        }
        else {
        	printFrequencyOfEvenElements(arr);
        }
	}

}
