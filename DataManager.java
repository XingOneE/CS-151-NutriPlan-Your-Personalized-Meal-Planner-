import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * The DataManager class is responsible for managing data, including saving and
 * loading Nutriplan objects to and from files.
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

		// Loop through mealPlan array in MealPlanManager (total of 7)
		for (int i = 0; i < profile.getMealPlanManager().getMealPlan().length; i++) {
			// Loop through foods array in MealPlan (total of 10)
			for (int j = 0; j < profile.getMealPlanManager().getMealPlan()[i].getFoods().length; j++) {
				FoodItem food = profile.getMealPlanManager().getMealPlan()[i].getFoods()[j];

				// Write food-related information to the file
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
	 * Placeholder method for loading data from a file.
	 */
	public void loadFile() {

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
