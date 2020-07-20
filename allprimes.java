//ex10 all primes in given range
import java.util.Scanner;
public class allprimes {
	public static void main(String args[]) {
		boolean flag=true;
		int i;
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();s.nextLine();
		int n2=s.nextInt();s.nextLine();
			int n = 0;
		for(i=n1;i<=n2;i++) {
				flag=prime(i);
				if(flag)
					System.out.println(i+ ",");
			}
	}
	public static boolean prime(int n) {
		int i;
		if(n==0||n==1) {
			return false;
		}
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
			}
			}
			return true;
		}
	}
			