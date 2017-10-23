package zhouxupeng;

import java.util.Scanner;

public class StringFactory {
             String s;
    public void  StringFactory(String s1) {
    	this.s=s;
    }
    static boolean compareTo(String s,String s1) {
		int len1 = s.length();
		int len2 = s1.length();
		int lim = Math.min(len1, len2);
		char[] charS = s.toCharArray();
		char[] charS1 = s1.toCharArray();
		int k = 0;
		while (k<lim)  {
			char c1 = charS[k];
			char c2 = charS1[k];
			if(c1>c2);
			boolean ture = false;
			return ture;
    }
		    return false;
		    public static void main(String[] args) {
		    	Scanner in = new Scanner(System.in);
		    	String a = in.next();
		    	String b = in.next();
		    	System.out.println("ÊäÈë×Ö·û´®String s:" + in.nextLine());
		    	System.out.println("ÊäÈë×Ö·û´®String s1:" + in.nextLine());
		    String s2 = "a";	
		    String s3 = "b";	
		    int result = s2.indexOf(s3);
		    if(result>=0) {
		    	System.out.println("Êä³ö:1");
		    
		    }else {
		    	System.out.println("Êä³ö:0");
		    }
		    
		    }
	}
}
