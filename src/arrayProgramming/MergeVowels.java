package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeVowels {
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		  ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					return true;
				else
					return false;
	}
    public static int countVowels(char arr[]) {
    	int count=0;
    	for(int i=0;i<arr.length;i++) {
    		if(isVowel(arr[i]))
    			count++;
    	}
    	return count;
    }
    public static void merge(char arr1[],char arr2[],char arr3[]) {
    	int index=0;
    	for(int i=0;i<arr1.length;i++) {
    		if(isVowel(arr1[i]))
    			arr3[index++]=arr1[i];
    	}
    	for(int i=0;i<arr2.length;i++) {
    		if(isVowel(arr2[i]))
    			arr3[index++]=arr2[i];
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of 1st array");
	    int size1=sc.nextInt();
	    char arr1[]=new char[size1];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size1;i++) {
	    	arr1[i]=sc.next().charAt(0);
	    }
	    System.out.println("Enter the size of 2nd array");
	    int size2=sc.nextInt();
	    char arr2[]=new char[size2];
	    System.out.println("Enter a elements");
	    for(int i=0;i<size2;i++) {
	    	arr2[i]=sc.next().charAt(0);
	    }
	    int length=countVowels(arr1)+countVowels(arr2);
        char arr3[]=new char[length];
        merge(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
	}

}
