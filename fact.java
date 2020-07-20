//ex1
import java.util.Scanner;
public class fact{
	public static void main(String args[]) {
		int fact=1,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number:");
		 n=s.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("fact="+fact);
	}
}