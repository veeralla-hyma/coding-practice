// ex 20
public class sample {
	String value="";
	public int compareTo(String anotherString) {
	    int len1 = value.length();
	    int len2 = anotherString.length();
	    int lim = Math.min(len1, len2);
	    char v1[] = value.toCharArray();
	    char v2[] = anotherString.toCharArray();

	    int k = 0;
	    while (k < lim) {
	        char c1 = v1[k];
	        char c2 = v2[k];
	        if (c1 != c2) {
	            return c1 - c2;
	        }
	        k++;
	    }
	    return len1 - len2;
	}
	public static void main(String[]args) {
		String str2 = "hyma";
	    String str3 = "hymaa";

	    int result = str3.compareTo( str2 );
	    System.out.println(result);

	    result = str2.compareTo( str3 );
	    System.out.println(result);
		
	}

}