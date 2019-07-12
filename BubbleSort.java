import java.io.*;
import java.util.*;
import java.lang.*;
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of elements in array: ");
		int n = sc.nextInt();
		int i,j,arr[],temp;
		arr = new int[n];
		
		for(i=0 ; i<n ; i++)
		{
			System.out.print("enter the element: ");
			arr[i] = sc.nextInt();
		}
		
		for(i=0 ; i<n-1 ; i++)
		{
			for(j=0 ; j<n-1-i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted array: ");
		for(i=0 ; i<n ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("array length: "+arr.length);
	}
}
