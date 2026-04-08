package reverseNumbers;

import java.util.Scanner;

public class ReverseConsecutivesNumbers {

	public static String reverse(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				String temp="";
				int index=i;
				for(int j=index;j<=str.length()-1;j++) {
					if(!Character.isDigit(str.charAt(j)))
						break;
					temp=str.charAt(j)+temp;
				}
				res=res+temp;
				i=i+temp.length()-1;
			}
			else {
				res=res+ch;
			}
		}
		return res;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.next();
    String res=reverse(str);
    System.out.println(res);
	}

}
