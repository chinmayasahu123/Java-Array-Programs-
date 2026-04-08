package arrayProgramming;

import java.util.Scanner;

public class FrequencyOfEachElement {

	public static void countAndPrintFrequency(int arr[]) {
		int visited=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=visited) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]&&arr[j]!=visited) {
						arr[j]=visited;
						count++;
					}
				}
				System.out.println("Element="+arr[i]+"-Frequency-->"+count);
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
    countAndPrintFrequency(arr);
	}

}
