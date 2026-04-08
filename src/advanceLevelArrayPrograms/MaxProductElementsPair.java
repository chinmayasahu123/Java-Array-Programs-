package advanceLevelArrayPrograms;

import java.util.Scanner;

public class MaxProductElementsPair {

	public static void maxProductElementsPair(int arr[]) {
		int max=0;int ele1=0,ele2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int pro=arr[i]*arr[j];
				if(max<pro) {
					max=pro;
					ele1=arr[i];
					ele2=arr[j];
				}
			}
		}
		System.out.println("Maximum Product="+max);
		System.out.println("("+ele1+","+ele2+")");
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a array size:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    maxProductElementsPair(arr);
	}

}
