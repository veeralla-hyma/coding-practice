import java.util.Scanner;

//ex6 string on console using method
public class console {
	public static void  print(String a) {
		System.out.println("Hell0, "+a+"!");
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		console.print(a);
	}

}
