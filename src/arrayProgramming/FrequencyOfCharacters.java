package arrayProgramming;

import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void countAndPrintCharactersFrequency(char arr[]) {
		char visited=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=visited) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==arr[i]&&arr[j]!=visited) {
						arr[j]=visited;
						count++;
					}
				}
				System.out.println("Character - "+arr[i]+" - Frequency = "+count);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
	    System.out.println("Enter a array size:");
	    int size=sc.nextInt();
	    char arr[]=new char[size];
	    System.out.println("Enter elements:");
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=sc.next().charAt(0);
	    countAndPrintCharactersFrequency(arr);
	}

}
