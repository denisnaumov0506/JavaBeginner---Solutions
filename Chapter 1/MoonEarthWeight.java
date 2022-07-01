/*
 * Write a program that computes your effective weight on the moon! (Source: Java A Beginner's Guide [Herbet Schildt])
 * 
 * Author: Denis Naumov
 * Creation date: 22.05.2021
 */

public class MoonEarthWeight {

	public static void main(String[] args) {
		double weightEarth, weightMoon;
		
		weightEarth = 75; // I weigh 75 Kg on Earth
		weightMoon = weightEarth*0.17;
		
		System.out.println("Your weight on earth is "
			+ weightEarth
			+ " Kg, but on the moon you would weigh "
			+ weightMoon + " Kg!"
			);
	}
}
