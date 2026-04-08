package arrayProgramming;

import java.util.Scanner;

public class Combination3 {

	public static int countEven(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		return count;
	}
	public static void split(int arr[],int arr1[],int arr2[]) {
		int index1=0;int index2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				arr1[index1++]=arr[i];
			else
				arr2[index2++]=arr[i];
		}
	}
	public static void rotateLeft(int arr[]){
		for(int i=1;i<=2;i++) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
	}
    public static void rotateRight(int arr[]) {
    	for(int i=1;i<=2;i++) {
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
	}
    public static void merge(int arr1[],int arr2[],int arr3[]) {
    	int index=0;
    	for(int i=0;i<arr1.length;i++)
    		arr3[index++]=arr1[i];
    	for(int i=0;i<arr2.length;i++)
    		arr3[index++]=arr2[i];
    }
    public static int sumOfElements(int arr[]) {
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		sum+=arr[i];
    	}
    	return sum;
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++)
    	arr[i]=sc.nextInt();
    int evenCount=countEven(arr);
    int oddCount=arr.length-evenCount;
    int evenArr[]=new int[evenCount];
    int oddArr[]=new int[oddCount];
    split(arr,evenArr,oddArr);
    rotateLeft(evenArr);
    rotateRight(oddArr);
    int[] mergeArr=new int[arr.length];
    merge(evenArr,oddArr,mergeArr);
    System.out.println("Sum of elements:"+sumOfElements(mergeArr));
}
}
