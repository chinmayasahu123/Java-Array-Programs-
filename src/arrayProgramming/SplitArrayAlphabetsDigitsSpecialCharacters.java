package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayAlphabetsDigitsSpecialCharacters {

	public static int countAlphabets(char arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>='A'&&arr[i]<='Z')||(arr[i]>='a'&&arr[i]<='z'))
				count++;
		}
		return count;
	}
	public static int countDigits(char arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=48&&arr[i]<=57)
				count++;
		}
		return count;
	}
	public static void splitArray(char arr[],char brr[],char crr[],char drr[]) {
		int index1=0;int index2=0;int index3=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>='A'&&arr[i]<='Z')||(arr[i]>='a'&&arr[i]<='z'))
				brr[index1++]=arr[i];
			else if(arr[i]>=48&&arr[i]<=57)
				crr[index2++]=arr[i];
			else  
				drr[index3++]=arr[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size=sc.nextInt();
	    char arr[]=new char[size];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.next().charAt(0);
	    }
	    System.out.println(Arrays.toString(arr));
	    int alphaCount=countAlphabets(arr);
	    int digitsCount=countDigits(arr);
	    int specialCharactersCount=arr.length-(alphaCount+digitsCount);
	    char brr[]=new char[alphaCount];
	    char crr[]=new char[digitsCount];
	    char drr[]=new char[specialCharactersCount];
	    splitArray(arr,brr,crr,drr);
	    System.out.println(Arrays.toString(brr));
	    System.out.println(Arrays.toString(crr));
	    System.out.println(Arrays.toString(drr));
	}

}
