//ex 11 areas
import java.util.Scanner;
public class areas {
	public static void main (String[] args) {
		int len,br,r,a;
		float area=(float) 0.00;
		Scanner s = new Scanner(System.in);
		String shape = s.nextLine();
		switch(shape){
			case "triangle":len=s.nextInt();
							br=s.nextInt();
							area=(float)(len*br)/2;
							break;
			case "rectangle":len=s.nextInt();
							br=s.nextInt();
							area=(float)len*br;
							break;
			case "square":a=s.nextInt();
							area=(float)a*a;
							break;
			case "circle":r=s.nextInt();
							area=(float) (3.14*r*r);
							break;
			default:System.out.println("Wrong Choice");
		}
		if((float)area>0)
		System.out.println(area);
		s.close();
		}
	}

