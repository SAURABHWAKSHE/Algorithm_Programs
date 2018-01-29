package com.bridgelabz.util;
import java.util.Scanner;

public class UtilSort 
{
	
	static String [] sTring,str ;
	static int k=0;
	static double startTime;
	static double endTime;
	static double elapsedTime=0;
	static double eTime[] = new double[6];
	
	/*
	 * binary Search for String
	 */
	public static boolean binarySearchString(String [] city,String key)
	{
		int i,j;
		int len = city.length; 
	
		for(i=0;i<len ;i++)
		{
			System.out.print(city[i]+" ");
		}
		System.out.println();
		int mid = len/2,start = 0,end = len-1;
		for(i=0;i<len ;i++)
		{
			int num;
			num=key.compareTo(city[mid]);
			if(num==0)
			{	
				return true;
				
			}
			else if (num<0)
			{
				end = mid--; 
				mid = (start+end)/2;
			}		
			else
			{
				start = mid++;
				mid = (start+end)/2;
			}
		}

		return false; 
		
	}
		
	/*
	 * Bubble Sort for Integers
	 */

	public static int[] bubbleSortInt(int[] iNteger) 
	{
		// TODO Auto-generated method stub
		for(int i = 0;i<iNteger.length;i++)
		{
			for(int j = i+1;j<iNteger.length;j++)
			{
				if(iNteger[j]<iNteger[i])
				{
					int temp = iNteger[i];
					iNteger[i] = iNteger[j] ;
					iNteger[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array Of BubbleSort:");
		for(int i = 0;i<iNteger.length;i++)
		{
			System.out.print( iNteger[i]+"   ");
		}
		System.out.println();
		return iNteger;
	}
	
	/*
	 * Bubble Sort for Strings
	 */
	public static String[] bubbleSortString(String[] sTring) 
	{
		// TODO Auto-generated method stub
		for(int i = 0;i<sTring.length;i++)
		{
			for(int j = i+1;j<sTring.length;j++)
			{
				if(sTring[j].compareTo(sTring[i])<0)
				{
					String temp = sTring[i];
					sTring[i] = sTring[j] ;
					sTring[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array Of BubbleSort:");
		for(int i = 0;i<sTring.length;i++)
		{
			System.out.print( sTring[i]+"   ");
		}
		System.out.println();	
		return sTring;
	}
	/*
	 * Insertion Sort for Integers
	 */

	public static void insertionSortInt(int[] iNteger) 
	{
		// TODO Auto-generated method stub
		int i,j;
		
		for(j=1;j<iNteger.length;j++)
		{
			i = j-1;  
			while(i>=0)
			{
				if(iNteger[j]<(iNteger[i]))
				{
					String str;
					str = sTring[j];
					sTring[j] = sTring[i];
					sTring[i] = str;
				}
				i--;
			}
			
		}
		System.out.println("Sorted Array Of Insertion Sort:");
		for(i = 0;i<iNteger.length;i++)
		{
			System.out.print( iNteger[i]+"   ");
		}
		System.out.println();
	}
	/*
	 * Insertion Sort for Strings
	 */
	public static void insertionSortString(String[] sTring) 
	{
		// TODO Auto-generated method stub
		int i,j;
		for(j=1;j<sTring.length;j++)
		{
			i = j-1;  
			while(i>=0)
			{
				if(sTring[j].compareTo(sTring[i])<0)
				{
					String str;
					str = sTring[j];
					sTring[j] = sTring[i];
					sTring[i] = str;
				}
				i--;
			}
			
		}
		System.out.println("Sorted Array Of Insertion Sort:");
		for(i = 0;i<sTring.length;i++)
		{
			System.out.print( sTring[i]+"   ");
		}
		System.out.println();
	}
	/*
	 * binary Search for Integers
	 */
	public static boolean binarySearchInt(int[] iNteger,int key) 
	{
		// TODO Auto-generated method stub
		
		int i,j;
		
		int mid = iNteger.length/2,start = 0,end = iNteger.length-1;
		for(i=0;i<iNteger.length ;i++)
		{
			if(key==iNteger[mid])
			{
				return true;
				
			}else if(key<iNteger[mid])
			{
				end = mid--; 
				mid = (start+end)/2;
			}
			else
			{
				start = mid++;
				mid = (start+end)/2;
			}
		}

		return false;
	}
}
