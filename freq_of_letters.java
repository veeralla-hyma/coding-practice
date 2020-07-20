// ex 24 frequency of letters in given string
import java.util.*;
public class freq_of_letters {
		static void Comp(String s) 
		{ 
			for (int i = 0; i < s.length(); i++) { 
				int count = 1; 
				while ((i+1<s.length()&&(s.charAt(i)==(s.charAt(i+1)-32)||s.charAt(i)==(s.charAt(i+1)+32))||(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)))) { 
					i++; 
					count++; 
				}
				System.out.print(s.charAt(i)+""+count); 
			} 

			System.out.println(); 
		} 
		public static void main(String args[]) 
		{ 
			Scanner s= new Scanner(System.in);
			String a=s.next();
			int len=a.length();
			char[]c=new char[len];
			for(int i=0;i<len;i++)
				c[i]=a.charAt(i);
			for(int i=0;i<len;i++)
			if(c[i]>='A' && c[i]<='Z')
	        { 
				c[i]=(char)((int)c[i]+32);
	        }
			String str = String.valueOf(c);
			freq_of_letters.Comp(str);
		} 
	} 


