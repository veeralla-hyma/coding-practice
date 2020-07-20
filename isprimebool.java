// ex 9 is prime by bool
import java.util.Scanner;
public class isprimebool {
	 static boolean isPrime(long n) {
		 if(n==0 ||n==1) 
			 return false;
		 for(long i=2;i<=n/2;i++) {
			 if((n%i)==0) {
				 return false;
			 }
		 }
		 return true;
		
	}
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
		  long n=s.nextLong();
		 System.out.println(isPrime(n));
	 }

}
