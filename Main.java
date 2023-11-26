
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

	public static void printMenu() {
		System.out.println("NUTRIPLAN OPTIONS MENU: ");
		System.out.println();
		System.out.println("1. Create a new meal plan");
		System.out.println("2. View current meal plan");
		System.out.println("3. Add meal to plan");
		System.out.println("4. Credits");
		System.out.println("5. Exit");
		System.out.println();
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome to Nutriplan!");
		System.out.println("");
		System.out.println("Here you can plan and organize your diet!");
		System.out.println("");

		Scanner scan = new Scanner(System.in); // used for all inputs

		int option = 0;

		Nutriplan np = new Nutriplan();

		while (option != 5) // mock-up menu
		{
			printMenu();

			option = scan.nextInt();

			switch (option) {
				case 1: {
					System.out.println("Creating new meal plan.");
					np.newPersonalInfo(scan);

					break;
				}
				case 2: {
					System.out.println("Viewing current meal plan.");
					np.printMealPlan();

					break;
				}
				case 3: {
					System.out.println("Adding meal to plan.");
					np.editMealPlan(scan);

					break;
				}
				case 4: {
					System.out.println("Credits");
					np.credits();

					break;
				}
				case 5: {
					System.out.println("Thank you for using Nutriplan! Ending program.");
					break;
				}

			}
			System.out.println("Would you like to continue working on your meal plan? Y/N");
			String continueOption = scan.next();
			if (continueOption.toUpperCase().equals("N")) {
				option = 5;
			}
		}
		scan.close();

	}

}
