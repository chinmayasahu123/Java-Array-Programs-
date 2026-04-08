package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementForSpecificIndex {

	public static void leftRotate(int arr[],int index) {
		for(int i=index+1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=0;
	}
	public static void removeElement(int arr[],int index) {
		arr[index]=0;
		leftRotate(arr,index);
	}
	public static void printElements(int arr[]) {
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++) {
			if(i==arr.length-2)
			System.out.print(arr[i]+"]");
			else
			System.out.print(arr[i]+",");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter a array elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
	    System.out.println("Enter a index:");
        int index=sc.nextInt();
        if(index<0||index>=arr.length)
        	System.out.println("No index found.");
        else {
        	removeElement(arr,index);
           System.out.println(Arrays.toString(arr));
           printElements(arr);
        }
        
	}

}
