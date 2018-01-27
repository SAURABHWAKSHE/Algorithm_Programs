package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearch 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str,st,city[];
		BufferedReader bfr=new BufferedReader(new FileReader("/home/bridgeit/Sid/Play/Algorithm_Programs/src/com/bridgelabz/programs/Cities.txt"));
        str=((bfr.readLine()).toLowerCase());
        city=str.split(" ");
        System.out.println(city.length);
		System.out.println("Enter a String That You Have to Search.");
		st = (sc.next().toLowerCase());
        if(Utility.binarySearch(city,st))
        	System.out.println("given word found in string array read from file");
        else
        	System.out.println("given word Not found in string array read from file");
	}
}
