//ex4
import java.util.Scanner;
public class Arrsum {
	public static void main(String args[]) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
	
	}

}
