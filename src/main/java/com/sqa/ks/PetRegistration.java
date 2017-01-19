/**
 * File Name: PetRegistration.java<br>
 * Shah, Krishna<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 18, 2017
 */
package com.sqa.ks;

import com.sqa.ks.helpers.*;

public class PetRegistration {

	static String name;

	static String address;

	static String age;

	static int numberOfPets;

	static int numberOfYears;

	static double totalRegistrationCost;

	static final double PET_REG_FEE = 45;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = ("Pet registration!");
		String userName = AppBasics.greetUserandGetName(appName);
		registerPets();
		AppBasics.farewellUser(userName, appName);
	}

	private static void registerPets() {
		numberOfPets = AppBasics.requestIntFromUser("How many pets would you like to register?", 1, 5);
		numberOfYears = AppBasics.requestIntFromUser("How many years do you want to register your pet?", 1, 100);
		totalRegistrationCost = PET_REG_FEE * numberOfPets * numberOfYears;
		System.out.printf("Thank you for registering your %d pet/pets, it will cost you $%.2f ", numberOfPets,
				totalRegistrationCost);
		int steps = 7;
		for (int i = 0; i < steps; i++) {
			System.out.println("Yippie" + (i + 1));
			do {
				System.out.println("do only once");
			} while (false);
			int[] numbers = { 1, 2, 3, 4 };
			for (int number : numbers) {
				System.out.println(number);
			}
		}
	}
}
