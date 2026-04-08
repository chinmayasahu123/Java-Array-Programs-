package advanceLevelArrayPrograms;

import java.util.Scanner;

public class NthLargestPrimeElement {

	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count==2;
	}
	public static int countPrime(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(checkPrime(arr[i]))
				count++;
		}
		return count;
	}
	public static int countDuplicatesAndRemove(int arr[]) {
		int visited=Integer.MIN_VALUE;int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited&&checkPrime(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]&&arr[j]!=visited&&checkPrime(arr[j])) {
						count++;
						arr[j]=visited;
					}
				}
			}
		}
		return count;
	}
	public static void subArrayWithoutsDuplicates(int arr[],int brr[]) {
		int visited=Integer.MIN_VALUE;int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited&&checkPrime(arr[i]))
				brr[index++]=arr[i];
		}
	}
	public static void sortingDesc(int brr[]) {
		for(int i=0;i<brr.length;i++) {
			for(int j=i+1;j<brr.length;j++) {
				if(brr[i]<brr[j]) {
					int temp=brr[i];
					brr[i]=brr[j];
					brr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter array elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter n value:");
	    int n=sc.nextInt();
        int primeCount=countPrime(arr);
        if(primeCount==0)
        	System.out.println("No prime elements present.");
        else {
        	int count=countDuplicatesAndRemove(arr);
        	int brr[]=new int[primeCount-count];
        	if(n>brr.length)
        		System.out.println("There is no prime number for "+n+"th element.");
        	else {
        		subArrayWithoutsDuplicates(arr,brr);
        		sortingDesc(brr);
        		System.out.println(n+"th largest prime element in the array is "+brr[n-1]);
        	}
        }
	}

}
