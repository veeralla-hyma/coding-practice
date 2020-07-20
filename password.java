//ex 18 password
import java.util.*;
public class password {
		public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
	String name=s.next();
	String a="";
	int age=s.nextInt();
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)>='A' && name.charAt(i)<='Z') {
			a=a+name.charAt(i);
		}
	}
	a=a+String.valueOf(age+"!");
	System.out.println(a);
	}		
	}



