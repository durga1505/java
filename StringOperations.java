import java.io.*;
import java.lang.*;
import java.util.*;
class StringOperations
{
	public static void main(String args[])
	{
		char c[] = {'D','u','r','g','a'};
		String s = new String(c,2,3);//2 is starting index and 3 is string length
		System.out.println(s);
		System.out.println();
		
		String s1 = new String(c);
		String s2 = new String("Rajesh");
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		System.out.println(s1+" "+s2);
		
		System.out.println("length: "+s3.length());
		
		System.out.println("\ncharAt(): "+s3.charAt(5));
		
		String s4 = new String("Boy");
		String s5 = new String("BOY");
		System.out.println("\ncompareTo(): "+s4.compareTo(s5));
		
		System.out.println("\ncompareToIgnoreCase(): "+s4.compareToIgnoreCase(s5));
		
		System.out.println("\nequals(): "+s4.equals(s5));
		
		System.out.println("\nequalsIgnoreCase(): "+s4.equalsIgnoreCase(s5));
		
		String s6 = new String("Durgarajesh");
		String s7 = new String("Durga");
		System.out.println("\nstartsWith(): "+s6.startsWith(s7));
		
		String s8 = new String("ajesh");
		System.out.println("\nendsWith(): "+s6.endsWith(s8));
		
		System.out.println("\nindexOf('r'): "+s6.indexOf("r"));
		
		System.out.println("\nlastIndexOf('r'): "+s6.lastIndexOf("r"));
		
		System.out.println("\nreplace(): "+s6.replace('a','i'));
		
		System.out.println("\nsubString(): "+s6.substring(5,8));
		
		System.out.println("\ntrim(): "+
	}
}
