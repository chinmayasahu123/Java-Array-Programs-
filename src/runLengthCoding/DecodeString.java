package runLengthCoding;

import java.util.Scanner;

public class DecodeString {

	public static String decodeString(String str) {
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch!='['&&ch!=']') {
				if(!Character.isDigit(ch)) {
					res=ch+res;
				}
				else {
					int n=ch-48;String temp="";
					for(int j=1;j<=n;j++) {
						temp=temp+res;
					}
					res=temp;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    System.out.println(decodeString(str));
	}

}
