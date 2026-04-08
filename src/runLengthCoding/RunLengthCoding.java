package runLengthCoding;

import java.util.Scanner;

public class RunLengthCoding {

	public static String runLengthString(String str) {
		String res="";int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1))
				count++;
			else {
				res+=str.charAt(i)+""+count+"";
				count=1;
			}
		}
		res+=str.charAt(str.length()-1)+""+count+"";
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    String res=runLengthString(str);
    System.out.println(res);
	}

}
