// ex 16 bubble and insertion sort of a given string
import java.util.*;
public class bubble_insertion_of_string {
	public static void BubbleSort(String[]a) {
		int n;
		String temp;
		n=a.length;
		for(int i=0;i<n-1;i++) 
		{
			for(int j=0;j<n-1-i;j++) 
			{
				if(a[j].compareTo(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		System.out.println("Op of Bubble Sort");
		System.out.println(Arrays.toString(a));
	}
public static void InsertionSort(String[]a) {
	for(int i = 1; i < a.length; i++){
	    String value = a[i];
	    int j = i - 1;
	    while(j >= 0 && a[j].compareTo(value)>0){
	      a[j + 1] = a[j];
	      j = j - 1;
	    }
	    a[j + 1] = value;
	  }
	System.out.println("Op of Insertion Sort");
	System.out.println(Arrays.toString(a));
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int size;
	System.out.println("Enter the size of array");
	size=s.nextInt();
	String[] a= new String[size];
	String[] b= new String[size];
	System.out.println("Enter the Elements of array");
	for(int i=0;i<size;i++) {
		a[i]=s.next();
	}
	for(int i=0;i<size;i++) {
		b[i]=a[i];
	}
	bubble_insertion_of_string.BubbleSort(a);
	bubble_insertion_of_string.InsertionSort(b);
}
}

