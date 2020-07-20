// ex 17 to print initials of a given name
import java.util.*;
public class initials {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String a="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				a=a+str.charAt(i);
			}
		}
		System.out.println(a);
	}		
		}