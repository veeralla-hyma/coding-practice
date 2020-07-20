//ex 12 
import java.util.Scanner;
public class bubblesort {
	public static void main(String[] args) 
	{
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();		
		int i,j;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		int len=a.length;
		for(i=0;i<len-1;i++) 
		{
			for(j=0;j<(len-1-i);j++) 
			{
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		for(i=0;i<n;i++) 
			System.out.print(a[i]+" ");
	}}