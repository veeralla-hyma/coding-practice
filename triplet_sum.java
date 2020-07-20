//ex 25 triplet sum
import java.util.*;
public class triplet_sum {
	static void findTriplets(int arr[], int n) 
	{ 
		for (int i=0; i<n-2; i++) 
		{ 
			for (int j=i+1; j<n-1; j++) 
			{ 
				for (int k=j+1; k<n; k++) 
				{ 
					if (arr[i]+arr[j]== arr[k]) 
					{ 
						System.out.print("<"+arr[i]+ " "+arr[j]+ " "+arr[k]+">"); 
					    System.out.print("\n"); 
					} 
				} 
			} 
		}
	}
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Size of array");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		findTriplets(arr, n);
	} 
	}