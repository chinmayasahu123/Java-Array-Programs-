package advanceLevelArrayPrograms;

import java.util.Scanner;

public class NthSmallestOddElement {

	public static int countOdd(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1)
				count++;
		}
		return count;
	}
	public static void oddArray(int arr[],int oddArr[]) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1)
				oddArr[index++]=arr[i];
		}
	}
	public static int countDuplicatesAndRemove(int oddArr[]) {
		int visited=Integer.MIN_VALUE;int count=0;
		for(int i=0;i<oddArr.length;i++) {
			if(oddArr[i]!=visited) {
				for(int j=i+1;j<oddArr.length;j++) {
					if(oddArr[i]==oddArr[j]&&oddArr[j]!=visited) {
						count++;
						oddArr[j]=visited;
					}
				}
			}
		}
		return count;
	}
	public static void subArrayWithoutsDuplicates(int arr[],int uniqArr[]) {
		int visited=Integer.MIN_VALUE;int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=visited)
				uniqArr[index++]=arr[i];
		}
	}
	public static void sortingDesc(int uniqArr[]) {
		for(int i=0;i<uniqArr.length;i++) {
			for(int j=i+1;j<uniqArr.length;j++) {
				if(uniqArr[i]<uniqArr[j]) {
					int temp=uniqArr[i];
					uniqArr[i]=uniqArr[j];
					uniqArr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size:");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter array elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter n value:");
	    int n=sc.nextInt();
        int oddCount=countOdd(arr);
	}

}
