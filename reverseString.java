//ex 22 reverse string only
import java.util.*;
public class reverseString{
public static void main(String[] a) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a sentence");
	String sentance=s.nextLine();
	StringTokenizer sT= new StringTokenizer(sentance,"., 1234567890",true);
	int tokensCount=sT.countTokens();
	String[] sentanceArray=new  String[tokensCount];
	String[] result= new  String[tokensCount];
	for(int i=0;i<tokensCount;i++) {
		sentanceArray[i]=sT.nextToken();
	}
	for(int i=0;i<tokensCount;i++) {
			result[i]=reverseString(sentanceArray[i]);
	}
	for(String i:result)
		System.out.print(i);	
}
public static String reverseString(String word) {
	int size=word.length();
	String result="";
	for(int i=0;i<size;i++) {
			result =result+ word.charAt(size-i-1);
		}
	return result;
}
	
}