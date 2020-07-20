//ex 15 insertion sort
import java.util.*;
public class insertionsort {
		public void InsertionSort(int[] a){
			int j;
			for(int i = 1; i <a.length; i++){
			    int value = a[i];
			    for( j = i - 1;j >= 0 && a[j] > value;j--){
			      a[j]=a[j+1];
			    }
			    value=a[j+1];
			  }
		}
		    public static void main(String args[])
		    {
		    	int n,i;
		    	insertionsort ob = new insertionsort();
		        Scanner s=new Scanner(System.in);
		        System.out.println("Enter size of array");
				n=s.nextInt();
				int a[] = new int[n];
				System.out.println("Enter  Elements of array");
				for( i=0;i<n;i++) 
				{
					a[i]=s.nextInt();
				}
		        ob.InsertionSort(a);
		        System.out.println("Sorted Array");
		        System.out.println(Arrays.toString(a));
		    }
		}


