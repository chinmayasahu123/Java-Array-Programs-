package arrayProgramming;

import java.util.Scanner;

public class FrequencyOfConsonantsCharacters {

	public static boolean checkVowel(char ch) {
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
		   ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		return false;
	}
	
	public static void countAndPrintConsonantCharactersFrequency(char arr[]) {
		char visited=Character.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=visited&&!checkVowel(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==arr[i]&&arr[j]!=visited&&!checkVowel(arr[i])) {
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
	    countAndPrintConsonantCharactersFrequency(arr);
	}
}
