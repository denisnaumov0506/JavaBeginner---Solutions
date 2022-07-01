/*
 * Show how a short-circuit AND can be used to prevent a divide-by-zero error.
 * (Source: Java A Beginner's Guide [Herbet Schildt])
 * 
 * Author: Denis Naumov
 * Creation date: 26.05.2021
 */

public class DivByZeroError {

	public static void main(String[] args) {
		int i = 0;
		int a = 10;
		
		if(i!=0 && a%i==0) {
			System.out.println(i + " is a factor of " + a);
		}
	}
}