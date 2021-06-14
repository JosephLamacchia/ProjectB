package main;

public class ConversionMethods {
	
	//Miles to Kilometers
	
	public static double MilesToKilometers(double miles) {double kilometers = miles *1.609344;
		return kilometers;}
	
	
	//Fahrenheit  to Celcius
	
	public static double FahrenheitToCelcius(double degreesfar) {double degreescel = (degreesfar-32)/1.8;
		return degreescel;}
	
	//Degrees to Radians
	
	public static double DegreesToRadians(double degrees) {double radians =degrees / 57.2957795;
		return radians;}
	
	//Feet to Meters

	public static double FeetToMeters(double feet) {double meters = feet / 3.2808399;
		return meters;}
	
	// Pounds to Kilograms
	
	public static double PoundsToKilograms(double pounds) {double kilograms = pounds/2.20462262;
		return kilograms;}
	
	//Gallons to Liters
	public static double GallonsToLiters(double gallons) {double liters =gallons * 3.78541178;
		return liters;}
	
}
