/*
 * Write a program that finds all of the prime numbers between 2 and 100. (Source: Java A Beginner's Guide [Herbet Schildt])
 * 
 * Author: Denis Naumov
 * Creation date: 26.05.2021
 */
public class PrimeNumberSearch {

	public static void main(String[] args) {
		
		boolean isPrime = true;
		
		for(int i = 2; i<=100; i++) {
			isPrime = true;
			for(int j = 2; j<=i; j++) {
				if(i%j==0 && i!=j) {
					isPrime = false;
				}
			}
			if(isPrime == true)
				System.out.println("Prime number: " + i);
		}
	}
}