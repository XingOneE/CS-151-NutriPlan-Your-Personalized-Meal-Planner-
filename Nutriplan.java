package package_a;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nutriplan {

	private PersonalInfo info;
	private MealPlanManager manager;

	/**
	 * Constructor for Nutriplan
	 */
	Nutriplan() {
		PersonalInfo newInfo = new PersonalInfo();
		MealPlanManager newManager = new MealPlanManager();

		setPersonalInfo(newInfo);
		setMealPlanManager(newManager);

	}

	/**
	 * Set new personal info
	 * 
	 * @param pi the new desired personal info
	 */
	public void setPersonalInfo(PersonalInfo pi) {
		info = pi;
	}

	/**
	 * Set new meal plan manager
	 * 
	 * @param m the new desired meal plan manager
	 */
	public void setMealPlanManager(MealPlanManager m) {
		manager = m;
	}

	/**
	 * Get the personal info of person
	 * 
	 * @return info the person info of person
	 */
	public PersonalInfo getPersonalInfo() {
		return info;
	}

	/**
	 * Get the meal plan manager of person
	 * 
	 * @return manager the meal plan manager of person
	 */
	public MealPlanManager getMealPlanManager() {
		return manager;
	}

	/**
	 * Takes user input to set new personal info
	 * 
	 * @param scan the desired scanner scanning for user input
	 */
	public void newPersonalInfo(Scanner scan) {

		String name = "";
		int height = 1;
		int weight = 1;

		System.out.println("Hello user, please provide us with some information about yourself: \n");

		System.out.println("What is your name?");
		name = scan.next();

		System.out.println("Your height (in inches)?");
		height = scan.nextInt();

		System.out.println("Your weight (in lbs)?");
		weight = scan.nextInt();

		PersonalInfo newInfo = new PersonalInfo(name, height, weight);
		info = newInfo;

		System.out.println("Enter the amount of allergies you have (max. 5)");
		int count = scan.nextInt();
		String al = "";

		System.out.println("Enter each allergy one by one:");
		for (int j = 0; j < count; j++) {
			al = scan.next();
			getPersonalInfo().addAllergies(al);
		}

	}

	/**
	 * Takes user input to set new personal info
	 * 
	 * @param scan the desired scanner scanning for user input
	 * @param np   the desired nutriplan to edit
	 */
	public void mainMenu(Scanner scan, Nutriplan np) throws FileNotFoundException {
		boolean value = true;
		int day = 0;

		// System.out.println("");

		System.out.println("Hello " + getPersonalInfo().getName());

		while (value == true) {

			System.out.println("Please select a day of the week to set up by inputing a #: \n");
			System.out.println("1. Sunday");
			System.out.println("2. Monday");
			System.out.println("3. Tuesday");
			System.out.println("4. Wednesday");
			System.out.println("5. Thursday");
			System.out.println("6. Friday");
			System.out.println("7. Saturday");
			System.out.println("8. Update Goals");
			System.out.println("9. Save and Exit (Go back to first screen)");

			day = scan.nextInt();

			if (day == 8) {
				getPersonalInfo().updateGoals(scan, np);
			} else if (day == 9) {
				DataManager dm = new DataManager();
				dm.saveFile(np);

				value = false;
			} else if (day <= 0 || day > 9) {

				System.out.println("Invalid option, try again");
			} else {
				getMealPlanManager().editMealPlan(day - 1, scan, np);
			}

		}

	}

	/**
	 * Prints out team member names
	 */
	public void credits() {
		System.out.println("The Nutriplan Team: \n");

		System.out.println("Xing Yu Luo: MealPlanManager, MealPlan");
		System.out.println("Vincent Nguyen: PersonalInfo, FoodItem, DataManager");
		System.out.println("Kshitij Tyagi: MealPlannerApp");
		System.out.println("Aaron Nguyen: Nutriplan");

	}

}
