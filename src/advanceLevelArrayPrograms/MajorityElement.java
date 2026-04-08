package advanceLevelArrayPrograms;

import java.util.Scanner;

public class MajorityElement {

	public static int majorityElement(int arr[]) {
		int count=1;int check=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				if(check==0)
				System.out.println("Majority Element:");
				System.out.println(arr[i]);
				check++;
			}
			count=1;
		}
		return check;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a array size:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter a array elements:");
    for(int i=0;i<arr.length;i++)
    	arr[i]=sc.nextInt();
    if(majorityElement(arr)==0)
    	System.out.println("No majority elements.");
	}

}
