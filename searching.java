import java.util.Scanner;
public class searching {
	static boolean key;
	static int n;
	public static boolean Search(int a[],int elem) {
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i]==elem)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		int elem;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=s.nextInt();		
		int i;
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter the search elem");
		elem=s.nextInt();
		key= searching.Search(a, elem);
		System.out.println(key);
	}
	}

