import java.io.*;
import java.util.*;
import java.lang.*;
class TwoDimArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		int r = sc.nextInt();
		System.out.print("enter the no. of cols: ");
		int c = sc.nextInt();
		int[][] mat = new int[r][c];
		for(int i=0 ; i<r ;i++)
		{
			for(int j=0 ; j<c ; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0 ; i<r ;i++)
		{
			for(int j=0 ; j<c ; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	
	
	}
}
