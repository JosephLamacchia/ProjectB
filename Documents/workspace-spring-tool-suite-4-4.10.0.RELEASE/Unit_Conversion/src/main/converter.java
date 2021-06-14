package main;

import java.util.Scanner;

public class converter {
	
	public static void main(String[] a) {

	int  menuSelection= 0;
	int n = 0;
	
	
	
	Scanner choice = new Scanner(System.in);

	
	while(menuSelection != 7) {
				 
		    menu.PrintMenu();

		    
		    menuSelection  = choice.nextInt();
		   
		    if(menuSelection == 7){System.out.println("Session Ended");
			choice.close();
			break;}
		   
			System.out.println();
			System.out.println("Enter the number of values you wish to convert");
			n = choice.nextInt();
			
			
			double[] choices = new double[n];

		   System.out.println("Enter Value(s) to Convert");
		   System.out.println("Please press 'Enter' after each entry");
			System.out.println(menuSelection);


		   			
		   for(int i=0; i<n;i++) { 
			   choices[i] = choice.nextDouble();

		   }
		   
			System.out.println();

		switch(menuSelection) {
		
		case 1: 
			for(double value : choices) {
			System.out.println(value + " mile(s) is equivilent to " + ConversionMethods.MilesToKilometers(value) + " kilometer(s)");
			System.out.println();
			}break;
			
		case 2: 
			for(double value : choices) {
			System.out.println(value + " degree	 is equivilent to " + ConversionMethods.DegreesToRadians(value) + " radian(s)");
			System.out.println();
			}break;
			
		case 3: 
			for(double value : choices) {
			System.out.println(value + " degrees Fahrenheit  is equivilent to " + ConversionMethods.FahrenheitToCelcius(value) + " degrees celcius");
			System.out.println();
			}break;
			
		case 4: 
			for(double value : choices) {
			System.out.println(value + " feet is equivilent to " + ConversionMethods.FeetToMeters(value) + " meters");
			System.out.println();
			}break;
			
		case 5: 
			for(double value : choices) {
			System.out.println(value + " pounds is equivilent to " + ConversionMethods.PoundsToKilograms(value) + " kilograms");
			System.out.println();
			}break;
			
		case 6: 
			for(double value : choices) {
			System.out.println(value + " gallons is equivilent to " + ConversionMethods.GallonsToLiters(value) + " liters");
			System.out.println();
			}break;
		
		default: 
			
			   System.out.println("Invalid Menu Selection");

		} }
	
	}}

