package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayVowelsConsonants {

	public static boolean checkVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;
		else
			return false;
	}
	public static int countVowels(char arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(checkVowel(arr[i]))
				count++;
		}
		return count;
	}
	public static void split(char arr[],char brr[],char crr[]) {
		int index1=0;int index2=0;
		for(int i=0;i<arr.length;i++) {
			if(checkVowel(arr[i]))
			brr[index1++]=arr[i];
			else
			crr[index2++]=arr[i];
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
        System.out.println("Array "+Arrays.toString(arr));
        int vowelCount=countVowels(arr);
        int consonantCount=arr.length-vowelCount;
        char brr[]=new char[vowelCount];
        char crr[]=new char[consonantCount];
        split(arr,brr,crr);
        System.out.println("Vowels array:"+Arrays.toString(brr));
        System.out.println("Consonant array:"+Arrays.toString(crr));
	}

}
