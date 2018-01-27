package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Size:");
		int i,j,arrSize;
		arrSize = sc.nextInt();
		String[] string = new String[arrSize];
		System.out.println("Enter Array Elements:");
		for(i=0;i<string.length;i++)
		{
			string[i] = sc.next();
		}
		String[] sortedArray = Utility.insSortArray(string);
		for(i=0;i<string.length;i++)
		{
		System.out.print(sortedArray[i]+" ");
		}
	}
}
