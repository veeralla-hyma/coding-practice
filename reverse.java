//ex 8 reverse
import java.util.Scanner;
public class reverse {
	public static void rev(int n) {
		int i,r,sum=0;
		while(n!=0) {
			i=n%10;
			sum=sum*10+i;
			n/=10;
			
		}
		System.out.println(sum);
	}
	public static void main(String args[]) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		reverse.rev(n);
		
	}

}
