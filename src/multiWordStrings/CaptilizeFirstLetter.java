package multiWordStrings;

import java.util.Scanner;

public class CaptilizeFirstLetter {

	public static String captilize(String str) {
		String res="";String st="";
		if(str.charAt(0)>='a'&&str.charAt(0)<='z') {
			char ch=str.charAt(0);
			ch=(char)(ch-32);
			res+=ch;
		}
		for(int i=1;i<str.length();i++) {
			st+=str.charAt(i);
		}
		res+=st.toLowerCase();
		return res;
	}
	public static String captilizeFirstLetter(String[] strs) {
		String res="";
		for(int i=0;i<strs.length;i++) {
			if(i!=strs.length-1)
				res+=captilize(strs[i])+" ";
			else
				res+=captilize(strs[i]);
		}
	    return res;	
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a 1st string:");
	String str=sc.nextLine();
    String strs[]=str.split(" ");
    System.out.println(captilizeFirstLetter(strs));
	}

}
