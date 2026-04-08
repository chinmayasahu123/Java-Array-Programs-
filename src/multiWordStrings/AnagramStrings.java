package multiWordStrings;

import java.util.Scanner;

public class AnagramStrings {

	public static boolean checkAnagram(String str1,String str2) {
		int arr[]=new int[26];
		str1=str1.toLowerCase();str2=str2.toLowerCase();
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				char ch1=str1.charAt(i);
				arr[ch1-'a']++;
				char ch2=str2.charAt(i);
				arr[ch2-'a']--;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0)
					return false;
			}
			return true;
		}
		else
			return false;
	}
//	public static String toLowerCase(String str) {
//		String str1="";
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(ch>='A'&&ch<='Z') {
//				ch=(char)(ch+32);
//			}
//		}
//		return str1;
//	}
	public static int printAnagramString(String strs[]) {
		int count=0;
		for(int i=0;i<strs.length;i++) {
			for(int j=0;j<strs.length;j++) {
				if(i!=j&&strs[i]!=""&&strs[j]!="") {
					if(checkAnagram(strs[i],strs[j])) {
						System.out.println("(\""+strs[i]+"\",\""+strs[j]+"\")");
						count++;
						strs[j]="";
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.nextLine();
	    String strs[]=str.split(" ");
	    if(printAnagramString(strs)==0)
	    	System.out.println("No anagram string.");;
	}

}
