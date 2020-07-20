// ex2
import java.util.Scanner;
public class Table {
	public static void main(String args[]) {
		int n,m, i,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number m and n values:");
		n=s.nextInt();
		m=s.nextInt();
		for(i=1;i<=m;i++) {
			k=n*i;
			System.out.println(+n+"*"+i+"="+k);
		}
		
	}

}
