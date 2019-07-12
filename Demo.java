import java.io.*;
import java.util.*;
class Demo1
{
	static int myMethod(int num)
	{
		return num*num;
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c = sc.next().charAt(0);
		String s = sc.nextLine();
		int res = Demo1.myMethod(n);
		System.out.println(res);
		System.out.println(s);
	}
}
