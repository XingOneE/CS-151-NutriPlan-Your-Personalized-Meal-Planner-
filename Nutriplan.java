
import java.util.Scanner;

public class Nutriplan {

	private PersonalInfo info;
	MealPlanManager manager;

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

		System.out.println("Hello user, please provide us with some information about yourself: \n");

		System.out.println("What is your name?");
		String name = scan.next();

		System.out.println("Your height (in ft)?");
		int height = scan.nextInt();

		System.out.println("Your weight (in lbs)?");
		int weight = scan.nextInt();

		PersonalInfo newInfo = new PersonalInfo(name, height, weight);
		info = newInfo;

	}

	/**
	 * Takes user input to edit meal plan
	 * 
	 * @param scan the desired scanner scanning for user input
	 */
	public void editMealPlan(Scanner scan) {
		System.out.println("What is the name of the food?");
		String name = scan.next();
		System.out.println("What is the price?");
		double price = scan.nextDouble();
		System.out.println("How many calories?");
		int calories = scan.nextInt();
		System.out.println("How many carbs?");
		int carbs = scan.nextInt();
		System.out.println("How much protein?");
		int protein = scan.nextInt();
		System.out.println("How many fat?");
		int fat = scan.nextInt();
		System.out.println("How much sugar?");
		int sugar = scan.nextInt();
		FoodItem food = new FoodItem(name, price, calories, carbs, protein, fat, sugar);
		System.out.println("What day would you like to add this to?");
		int dayOfWeek = scan.nextInt();
		manager.addFoodItem(dayOfWeek, food);
	}

	/**
	 * Prints of meal plan of person
	 */
	public void printMealPlan() {
		manager.printEntireMealPlan();
	}

	/**
	 * Prints out team member names
	 */
	public void credits() {
		System.out.println("The Nutriplan Team: ");
		System.out.println();
		System.out.println("Xing Yu Luo: ");
		System.out.println("Vincent Nguyen: ");
		System.out.println("Kshitij Tyagi: ");
		System.out.println("Aaron Nguyen: ");

	}

}
