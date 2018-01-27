package com.bridgelabz.programs;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class TemperaturConversion
{
	static double celTemp,tempFah;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp.in Celcius: ");
		celTemp = sc.nextDouble();
		System.out.println("Enter Temp.in fahrenheit: ");
		tempFah = sc.nextDouble();
		double F = Utility.celToFah(celTemp);
		System.out.println("celToFah: "+celTemp+" celcius = "+F+" fahrenheit");
		double C = Utility.fahToCal(tempFah);
		System.out.println("celToFah: "+tempFah+" fahrenheit = "+C+" celcius");
	}
	
}
