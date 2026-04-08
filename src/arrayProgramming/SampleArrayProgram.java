package arrayProgramming;

import java.util.Scanner;

public class SampleArrayProgram {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of students:");
    int n=sc.nextInt();
    int studentAges[]=new int[n];
    for(int i=0;i<n;i++) {
    	System.out.println("Enter the age for "+(i+1)+" student:");
    	studentAges[i]=sc.nextInt();
    	
    }
    System.out.println("All student age's:");
    for(int i=0;i<n;i++) {
    	System.out.println(studentAges[i]);
    }
    System.out.println("Ages greater than 23");
    for(int i=0;i<n;i++) {
    	if(studentAges[i]>23)
    	System.out.println(studentAges[i]);
    }
   System.out.println("Even ages");
    for(int i=0;i<n;i++) {
    	if(studentAges[i]%2==0)
    	System.out.println(studentAges[i]);
    }
    
	}

}
