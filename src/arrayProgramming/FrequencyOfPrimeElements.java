package arrayProgramming;

import java.util.Scanner;

public class FrequencyOfPrimeElements {

	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static int countPrime(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i]))
				count++;
		}
		return count;
	}
	public static void printFrequencyOfEvenElements(int arr[]) {
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=visited&&checkPrime(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[i]==arr[j]&&checkPrime(arr[j])) {
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
       if(countPrime(arr)==0)
    	   System.out.println("No prime elements present.");
       else
    	   printFrequencyOfEvenElements(arr);  
	}

}
