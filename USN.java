// ex 21 usn
import java.util.*;
public class USN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("ENTER U.S.N");
		String usn=s.nextLine();
		int len=usn.length();
		if(len!=10) {
			System.out.println("invalid Ussn");
		}
		char[] a= new char[10];
		for(int i=0;i<10;i++) {
			a[i]=usn.charAt(i);
		}
		if(a[0]=='1'||a[0]=='2') {
			if((a[1]>='A'||a[1]<='Z')&&(a[2]>='A'||a[2]<='Z')) {
				if((Character.isDigit(a[3])==true)&&(Character.isDigit(a[4])==true)) {
					if((a[5]=='C'&&a[6]=='S')||(a[5]=='I'&&a[6]=='S')||(a[5]=='E'&&a[6]=='C')||(a[5]=='M'&&a[6]=='E')) {
						if((Character.isDigit(a[7])==true)&&(Character.isDigit(a[8])==true)&&(Character.isDigit(a[9])==true)) {
							count=1;
						}
					}
				}
			}	
		}
		if(count==1) {
			System.out.println("success");
		}
		else {
			System.out.println("failure");
		}	
	}
}
