package advanceLevelArrayPrograms;

import java.util.Scanner;
public class NthSmallest {

	public static int duplicates(int arr[]) {
		int count=0;int visited=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=visited&&arr[i]==arr[j]) {
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
			if(arr[i]!=visited)
				brr[index++]=arr[i];
		}
	}
	public static void sortingAsc(int brr[]) {
		for(int i=0;i<brr.length;i++) {
			for(int j=i+1;j<brr.length;j++) {
				if(brr[i]>brr[j]) {
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
    int count=arr.length-duplicates(arr);
    int brr[]=new int[count];
    subArrayWithoutsDuplicates(arr,brr);
    sortingAsc(brr);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    if(n>brr.length)
    	System.out.println("There is no "+n+"th smallest number in the array.");
    else
    	System.out.println(n+"th smallest number is "+brr[n-1]);
	}

}
