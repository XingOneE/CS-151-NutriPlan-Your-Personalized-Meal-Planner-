package package_a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The DataManager class is responsible for managing data, including saving,
 * loading, and clearing Nutriplan objects to and from files.
 */
public class DataManager {

	/**
	 * Default constructor for the DataManager class.
	 */
	DataManager() {

	}

	/**
	 * Saves the data from a Nutriplan object to a file.
	 *
	 * @param profile The Nutriplan object containing the data to be saved.
	 * @throws FileNotFoundException If the specified file is not found.
	 */
	public void saveFile(Nutriplan profile) throws FileNotFoundException {
		// Get the current working directory
		String directory = System.getProperty("user.dir");

		// Create a new File object representing a file named "NutriplanData" in the
		// current directory
		File newData = new File(directory + "\\NutriplanData");

		// If the file doesn't exist, create a new file
		if (!newData.exists()) {
			try {
				newData.createNewFile();
			} catch (IOException e) {
				System.out.println("An error has occurred.");
				e.printStackTrace();
			}
		}

		// Create a PrintWriter to write data to the file
		PrintWriter pen = new PrintWriter(newData);

		// Write personal information from the Nutriplan object to the file
		pen.print(profile.getPersonalInfo().getName());
		pen.print(" ");
		pen.print(profile.getPersonalInfo().getHeight());
		pen.print(" ");
		pen.print(profile.getPersonalInfo().getWeight());
		pen.print(" ");

		// Write allergies information from the Nutriplan object to the file
		for (int m = 0; m < profile.getPersonalInfo().getAllergies().length; m++) {
			pen.print(profile.getPersonalInfo().getAllergies()[m]);
			pen.print(" ");
		}

		// Write goal information from the Nutriplan object to the file
		pen.print(profile.getPersonalInfo().budget);
		pen.print(" ");
		pen.print(profile.getPersonalInfo().calGoals);
		pen.print(" ");
		pen.print(profile.getPersonalInfo().carbGoals);
		pen.print(" ");
		pen.print(profile.getPersonalInfo().protGoals);
		pen.print(" ");
		pen.print(profile.getPersonalInfo().fatGoals);
		pen.print(" ");
		pen.print(profile.getPersonalInfo().sugGoals);
		pen.print(" ");

		// Loop through mealPlan array in MealPlanManager (total of 7)
		for (int i = 0; i < profile.getMealPlanManager().getMealPlan().length; i++) {
			pen.print(profile.getMealPlanManager().getMealPlan()[i].dayBudget);
			pen.print(" ");

			// Loop through foods array in MealPlan (total of 10)
			for (int j = 0; j < profile.getMealPlanManager().getMealPlan()[i].getFoods().length; j++) {
				FoodItem food = profile.getMealPlanManager().getMealPlan()[i].getFoods()[j];

				pen.print(food.getName());
				pen.print(" ");
				pen.print(food.getPrice());
				pen.print(" ");
				pen.print(food.getCalories());
				pen.print(" ");
				pen.print(food.getCarbs());
				pen.print(" ");
				pen.print(food.getProtein());
				pen.print(" ");
				pen.print(food.getFat());
				pen.print(" ");
				pen.print(food.getSugar());
				pen.print(" ");
			}
		}

		// Print a success message to the console
		System.out.println("Save success.");

		// Close the PrintWriter and exit the program with a status code of 0
		pen.close();
		System.exit(0);
	}

	/**
	 * Loads data from a file into a Nutriplan object.
	 *
	 * @param saveFile The file path to load the data from.
	 * @param profile  The Nutriplan object to load the data into.
	 * @throws FileNotFoundException If the specified file is not found.
	 */
	public void loadFile(String saveFile, Nutriplan profile) throws FileNotFoundException {
		// Create a File object based on the provided file path
		File loadSave = new File(saveFile);

		// Create a Scanner to read from the file
		Scanner pen = new Scanner(loadSave);

		// Read the first line of the file
		String line = pen.nextLine();

		// Create a Scanner to process the line
		Scanner lineReader = new Scanner(line);

		// Set personal information in the Nutriplan object based on file data
		profile.getPersonalInfo().setName(lineReader.next());
		profile.getPersonalInfo().setHeight(lineReader.nextInt());
		profile.getPersonalInfo().setWeight(lineReader.nextInt());

		// Set allergies information in the Nutriplan object based on file data
		for (int m = 0; m < profile.getPersonalInfo().getAllergies().length; m++) {
			profile.getPersonalInfo().addAllergies(lineReader.next());
		}

		// Set goal information in the Nutriplan object based on file data
		profile.getPersonalInfo().budget = lineReader.nextDouble();
		profile.getPersonalInfo().calGoals = lineReader.nextDouble();
		profile.getPersonalInfo().carbGoals = lineReader.nextDouble();
		profile.getPersonalInfo().protGoals = lineReader.nextDouble();
		profile.getPersonalInfo().fatGoals = lineReader.nextDouble();
		profile.getPersonalInfo().sugGoals = lineReader.nextDouble();

		// Loop through mealPlan array in MealPlanManager (total of 7)
		for (int i = 0; i < profile.getMealPlanManager().getMealPlan().length; i++) {
			// Set dayBudget in MealPlan based on file data
			profile.getMealPlanManager().getMealPlan()[i].dayBudget = lineReader.nextDouble();

			// Loop through foods array in MealPlan (total of 10)
			for (int j = 0; j < profile.getMealPlanManager().getMealPlan()[i].getFoods().length; j++) {
				FoodItem food = profile.getMealPlanManager().getMealPlan()[i].getFoods()[j];

				// Set food-related information in the Nutriplan object based on file data
				food.setName(lineReader.next());
				food.setPrice(lineReader.nextDouble());
				food.setCalories(lineReader.nextDouble());
				food.setCarbs(lineReader.nextDouble());
				food.setProtein(lineReader.nextDouble());
				food.setFat(lineReader.nextDouble());
				food.setSugar(lineReader.nextDouble());
			}
		}

		// Print a loading complete message to the console
		System.out.println("Loading complete!");

		// Close the Scanners
		lineReader.close();
		pen.close();
	}

	/**
	 * Clears the data in a Nutriplan object.
	 *
	 * @param profile The Nutriplan object to clear.
	 */
	public void clearFile(Nutriplan profile) {
		// Create an empty Nutriplan object
		Nutriplan empty = new Nutriplan();

		// Set the provided Nutriplan object to the empty object
		profile = empty;
	}

	/**
	 * The main method for testing the DataManager class.
	 *
	 * @param args Command line arguments (not used in this application).
	 * @throws FileNotFoundException If the specified file is not found.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Create a Nutriplan object for testing
		Nutriplan test = new Nutriplan();

		// Create a DataManager object
		DataManager testSave = new DataManager();

		// Save the Nutriplan object to a file
		testSave.saveFile(test);
	}
}
