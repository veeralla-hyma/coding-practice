//ex7 max of 3
//using numbers
import java.util.Scanner;
public class maxofthree {
	public static void getMax(int a, int b, int c) {
		if(a>b&&a>c) {
			System.out.println(a);
		}else if(b>a&&b>c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
			
		}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		maxofthree.getMax(a, b, c);
	}

}

