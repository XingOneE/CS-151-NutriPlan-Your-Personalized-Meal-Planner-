package package_a;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

	
	
	
	
	
	public static void main(String[] args)  throws FileNotFoundException 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);		//used for all inputs
		
		String directory = System.getProperty("user.dir");
		int option = 0;
		
		Nutriplan np = new Nutriplan();
		DataManager dm = new DataManager();
		
		
		
		
		while(option != 5)													//mock-up menu
		{
			System.out.println("Welcome to Nutriplan \n");
			
			System.out.println("Type in the # of the option you wish to select: \n");
			System.out.println("1) Create a new meal plan");
			System.out.println("2) Read current meal plan");
			System.out.println("3) View/Edit current meal plan");
			System.out.println("4) Credits");
			System.out.println("5) Exit");
			
			option = scan.nextInt();
			
			switch (option)
			{
				case 1:
				{
					System.out.println("Creating new meal plan");
					np.newPersonalInfo(scan);
					
					np.mainMenu(scan, np);
					
					option = 5;
					break;
				}
				case 2:
				{
					try
					{
						System.out.println("Reading current meal plan");
						dm.loadFile(directory + "\\NutriplanData", np);
						
						for(int t = 0; t < 7; t++)
						{
							np.getMealPlanManager().displayMealPlan(t);
						}
					}
					catch(Exception e)
					{
						System.out.println("File not found.");
					}
					
					
					//option = 5;
					break;
				}
				case 3:
				{
					
					
					try
					{
						System.out.println("Edit current meal plan");
						dm.loadFile(directory + "\\NutriplanData", np);
						np.mainMenu(scan, np);
					}
					catch(Exception e)
					{
						System.out.println("File not found.");
					}
					
					option = 5;
					break;
				}
				case 4:
				{
					System.out.println("Credits");
					np.credits();
					
					break;
				}
				case 5:
				{
					System.out.println("Shuting down...");
					break;
				}


			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		scan.close();
		
	}

}
