// ex3 hailstone sequence
import java.util.Scanner;
public class Hailstone {
	public static void main(String args[]) {
		int n;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		n=s.nextInt();
		while(n>1) {
		if(n%2==0) {
			n=n/2;
			System.out.println(n);
		}
		else {
			n=(n*3)+1;
			System.out.println(n);
		}
		c++;
	}
		System.out.println("there are total" +c+ "steps to reach 1");
	}

}
