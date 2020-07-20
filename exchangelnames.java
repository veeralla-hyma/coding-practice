//ex 19 exchange last names
import java.util.*;
public class exchangelnames {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		String firstName=a.substring(0,a.indexOf(" "));
        String lastName=a.substring(a.indexOf(" "));
		String firstName1=b.substring(0,b.indexOf(" "));
        String lastName1=b.substring(b.indexOf(" "));
        String swapName=firstName+" "+lastName1;
        String swapName2=firstName1+" "+lastName;
        System.out.println("After Swap");
        System.out.println(swapName);
        System.out.println(swapName2);
	}
}
