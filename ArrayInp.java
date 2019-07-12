import java.io.*;
import java.util.*;
class ArrayInp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int marks[],i;
		float[] cgpa = new float[5];
		marks = new int[5];
		String[] names = new String[5];
		
		for(i=0;i<5;i++)
		{
			marks[i] = sc.nextInt();
			cgpa[i] = sc.nextFloat();
			names[i] = sc.next();
		}
		for(i=0;i<5;i++)
		{
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			System.out.print(cgpa[i]+" ");
		}
		System.out.println();
		for(i=0;i<5;i++)
		{
			System.out.print(names[i]+" ");
		}
	}
}
