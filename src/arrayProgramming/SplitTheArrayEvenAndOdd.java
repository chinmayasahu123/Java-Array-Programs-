package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SplitTheArrayEvenAndOdd {

	public static int evenCount(int []arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
        int evenCount=evenCount(arr);
        int oddCount=arr.length-evenCount;
        
        if(evenCount==0) {
        	System.out.println("No even elements.");
        	System.out.println("Odd elements array "+Arrays.toString(arr));
        }
        else if(oddCount==0) {
        	System.out.println("No odd elements.");
        	System.out.println("Even elements array "+Arrays.toString(arr));
        }
        else {
        	splitArray(evenCount,oddCount,arr);
        }
	}
	public static void splitArray(int evenCount, int oddCount,int []arr) {
		int brr[]=new int[evenCount];
		int crr[]=new int[oddCount];
		int index1=0;int index2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				brr[index1++]=arr[i];
			else
				crr[index2++]=arr[i];
		}
		System.out.println("Even sub array "+Arrays.toString(brr));
		System.out.println("Odd sub array "+Arrays.toString(crr));
	}

}
