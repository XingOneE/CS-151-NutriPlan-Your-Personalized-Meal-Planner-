
import java.util.Scanner;

public class Nutriplan {

	private PersonalInfo info;
	MealPlanManager manager;

	Nutriplan() {
		PersonalInfo newInfo = new PersonalInfo();
		MealPlanManager newManager = new MealPlanManager();

		setPersonalInfo(newInfo);
		setMealPlanManager(newManager);

	}

	public void setPersonalInfo(PersonalInfo pi) {
		info = pi;
	}

	public void setMealPlanManager(MealPlanManager m) {
		manager = m;
	}

	public PersonalInfo getPersonalInfo() {
		return info;
	}

	public MealPlanManager getMealPlanManager() {
		return manager;
	}

	public void newPersonalInfo(Scanner scan) {

		String name = "";
		int height = 1;
		int weight = 1;

		System.out.println("Hello user, please provide us with some information about yourself: \n");

		System.out.println("What is your name?");
		name = scan.next();

		System.out.println("Your height (in ft)?");
		height = scan.nextInt();

		System.out.println("Your weight (in lbs)?");
		weight = scan.nextInt();

		PersonalInfo newInfo = new PersonalInfo(name, height, weight);
		info = newInfo;

	}

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

	public void printMealPlan() {
		manager.printEntireMealPlan();
	}

	public void credits() {
		System.out.println("The Nutriplan Team: ");
		System.out.println();
		System.out.println("Xing Yu Luo: ");
		System.out.println("Vincent Nguyen: ");
		System.out.println("Kshitij Tyagi: ");
		System.out.println("Aaron Nguyen: ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
