package qMain;

import java.util.Scanner;

public class QB_Rating {

	public static void main(String[] args) {
		// Creating Variables
		double interceptions, passAttempts, passCompletions, passingYards, tDPasses;
		
		Scanner input = new Scanner(System.in); //System.in inputting into your system aka keyboard. Scanner is a listener, opens and waits for info to be inputed
		
		//Asking user questions
		System.out.println("How many interceptions did the player get? ");
		interceptions = input.nextDouble();
		System.out.println("How passes did the player attempt? ");
		passAttempts = input.nextDouble();
		System.out.println("How many passes did the player complete? ");
		passCompletions = input.nextDouble();
		System.out.println("How many yards did the player pass over? ");
		passingYards = input.nextDouble();
		System.out.println("How many touchdown passes did the player make? ");
		tDPasses = input.nextDouble();
	}
		public double playerRating(double interceptions, double passAttempts, double passCompletions, double passingYards, double tDPasses)
		{
		double a = ((((passCompletions/passAttempts)* 100)- 30) / 10);
		double b = (((tDPasses/passAttempts)* 100)/ 5);
		double c = ((9.5 - ((interceptions / passAttempts)* 100))/ 4);
		double d = (((passingYards/passAttempts)- 3)/ 4);
		
		double rating = ((a + b + c + d) / .06);
		System.out.printf("Your QB Score is %", rating);
			return rating;
		}
		
}
