package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BubbleSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size:");
		int n,i,j;
		n = sc.nextInt();
		int [] aArr = new int [n];
		System.out.println("Enter The Array Elements:");
		for(i = 0;i<n;i++)
		{
			aArr[i] = sc.nextInt();
		}
		int [] aArrSorted = Utility.bubbleSort(aArr,n);
		
		System.out.println("Sorted Array:");
		for(i = 0;i<n;i++)
		{
			System.out.print(aArr[i]+" ");
		}
	}
}
	
