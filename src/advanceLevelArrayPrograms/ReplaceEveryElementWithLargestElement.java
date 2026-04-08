package advanceLevelArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceEveryElementWithLargestElement {

	public static void replace(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int max=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(max<arr[j])
					max=arr[j];
			}
			arr[i]=max;
		}
		arr[arr.length-1]=-1;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a size of the array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter elelments:");
    for(int i=0;i<arr.length;i++)
    	arr[i]=sc.nextInt();
    System.out.println("Before replacing:"+Arrays.toString(arr));
    replace(arr);
    System.out.println("After replacing:"+Arrays.toString(arr));
	}

}
