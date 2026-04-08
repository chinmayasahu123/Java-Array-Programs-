package advanceLevelArrayPrograms;

import java.util.Scanner;

public class NthEvenLargeElement {

	public static int countEven(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static int duplicates(int arr[]) {
		int count=0;int visited=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited&&arr[i]%2==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[i]==arr[j]&&arr[i]%2==0) {
						arr[j]=visited;
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void subArrayWithoutsDuplicates(int arr[],int brr[]) {
		int visited=Integer.MIN_VALUE;int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited&&arr[i]%2==0)
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
	    if(countEven(arr)==0)
	    	System.out.println("There is no even elements present in the array.");
	    else {
	    int count=countEven(arr)-duplicates(arr);
	    int brr[]=new int[count];
	    subArrayWithoutsDuplicates(arr,brr);
	    sortingDesc(brr);
	    
	    if(n>brr.length)
	    	System.out.println("There is no "+n+"th even largest number in the array.");
	    else
	    	System.out.println(n+"th even largest number is "+brr[n-1]);
		}

	}

	}


