//ex23 consecutive repetition of letters in given string
import java.util.*;
public class consqrep {
	public static void main(String[]args) {
		String y="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		 String x=s.nextLine();
		for(int i=0;i<x.length();i++) {
			int ch=(int)x.charAt(i);
			if(ch>='a'&&ch<='z') {
				ch=ch-32;
				y=y+(char)ch;
			}
			else {
				y=y+(char)ch;
			}		
		}
		System.out.println(y);
		printConsecutiveChars(y);
	}
	
	public static void printConsecutiveChars(String a) {
		int flag,j=65,count=0;
		char x='0';
		char y='0';
		while(j<=90) {
			count=flag=0;
			for(int i=1;i<a.length();i++) {
				if((a.charAt(i-1)==(char)(j))&&(a.charAt(i)==(char)(j+1))) {
					x=a.charAt(i-1);
					y=a.charAt(i);
					count++;
					flag++;
				}
			}
			if(flag>0) {
				System.out.print(x);
				System.out.println(y+":"+count);
			}
			j++;
		}
	}
}
