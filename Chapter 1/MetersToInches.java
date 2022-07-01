/*
 * Adapt Try This 1-2 so that it prints a conversion table of inches to meters.
 * Display 12 feet of conversions, inch by inch. Output a blank line every 12
 * inches. (One meter equals approximately 39.37 inches.) 
 * (Source: Java A Beginner's Guide [Herbet Schildt])
 * 
 * I intentionally did it slightly different and converted meters to inches, since I'm familiar with
 * meters but not inches. Makes it more interesting that way. I made a blank space every ten meters.
 *
 * Author: Denis Naumov
 * Creation date: 22.05.2021
 */
public class MetersToInches {

	public static void main(String[] args) {
		
		double meter, inches;
		int count = 0;	
		
		meter=0;
		
		for(meter = 1; meter <=100; meter++) {
			inches=meter*39.97;
			System.out.println(meter + " meter equals " + inches + " inches!");
			
			count++;
			if(count == 10) {
				System.out.println();
				count = 0;
			}
		}
	}
}
