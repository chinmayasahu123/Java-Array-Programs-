package subStringPrograms;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void replaceDuplicatesWithMin(char ch[]) {
		char visited=Character.MAX_VALUE;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=visited) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[j]!=visited) {
						if(ch[i]==ch[j])
							ch[j]=visited;
						else
							break;
					}
				}
			}
		}
	}
	public static String string(char ch[]) {
		String str="";char visited=Character.MAX_VALUE;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=visited)
				str+=ch[i];
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a string:");
	    String str=sc.next();
	    char ch[]=str.toCharArray();
	    replaceDuplicatesWithMin(ch);
	    System.out.println(string(ch));
	}

}
