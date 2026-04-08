package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementForSpecificElement {

	public static void leftRotate(int arr[],int index) {
		System.out.println(arr[index]+" Successfully deleted.");
		arr[index]=0;
		for(int i=index+1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=0;
		
		 printElements(arr);
	}
	public static void removeElement(int arr[],int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				leftRotate(arr,i);
				break;
			}
			if(i==arr.length-1) {
				System.out.println(ele+" not found");
				printElements(arr);
			}
		}
	}
	public static void printElements(int arr[]) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter a array elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
	    System.out.println("Enter element:");
        int ele=sc.nextInt();
        removeElement(arr,ele);
       
	}

}
