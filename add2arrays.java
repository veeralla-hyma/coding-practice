//ex5 addition of two arrays
import java.util.*;
public class add2arrays {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
	        double a1[]=new double[n];
	        for( int i=0;i<n;i++)
	        a1[i]=s.nextDouble();
	        int m=s.nextInt();
	        double a2[]=new double[m];
	        for( int i=0;i<m;i++)
	        	a2[i]=s.nextDouble();
	        int maxLength=(a1.length>a2.length)?a1.length:a2.length;
	        int iSumArray[]=new int[maxLength];
	        for(int i=0;i<maxLength;++i)
	        {
	            iSumArray[i]=0;
	            if(a1.length>i)
	            {
	                iSumArray[i]+=(int)(a1[i]);
	            }
	            if(a2.length>i)
	            {
	                iSumArray[i]+=(int)(a2[i]);
	            }
	            System.out.print(iSumArray[i]+"   ");
	        }
	        System.out.println();

		}

}
