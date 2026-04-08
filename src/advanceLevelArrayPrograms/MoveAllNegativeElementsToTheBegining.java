package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativeElementsToTheBegining {

	public static void rightRotate(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	public static int moveNegativeElements(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				rightRotate(arr,i);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        if(moveNegativeElements(arr)==0)
        	System.out.println("No negative elements.");
        else
        	System.out.println(Arrays.toString(arr));
	}

}
