package arrayProgramming;

import java.util.Scanner;

public class Combination2 {

	public static void rightRotateTheArrayNTimes(char[] arr,int n) {
		for(int j=1;j<=n;j++) {
		char temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=temp;
		}
	}
	
	public static int sumOfASCIIValuesOfEvenIndicesElements(char[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				sum+=arr[i];
		}
		return sum;
	}

	public static boolean isPalindrome(int sum) {
		int rev=0;int temp=sum;
		while(sum>0) {
			rev=rev*10+sum%10;
			sum/=10;
		}
		return sum==rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a array size");
	    int size=sc.nextInt();
	    char arr[]=new char[size];
	    System.out.println("Enter a array elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.next().charAt(0);
        System.out.println("Enter a n value for right rotation");
        int n=sc.nextInt();
        rightRotateTheArrayNTimes(arr,n);
        int sum=sumOfASCIIValuesOfEvenIndicesElements(arr);
        if(isPalindrome(sum))
        	System.out.println("Sum Of ASCII Values Of Even Indices Elements is palindrome number."+sum);
        else
        	System.out.println("Sum Of ASCII Values Of Even Indices Elements is  not palindrome number."+sum);
	}

	

	
}
