package package_a;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

	
	
	
	
	
	public static void main(String[] args)  throws FileNotFoundException 
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);		//used for all inputs
		
		int option = 0;
		
		Nutriplan np = new Nutriplan();
		
		
		
		
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
					np.mainMenu(scan);
					
					option = 5;
					break;
				}
				case 2:
				{
					System.out.println("Reading current meal plan");
					np.mainMenu(scan);
					
					//option = 5;
					break;
				}
				case 3:
				{
					System.out.println("Edit current meal plan");
					np.mainMenu(scan);
					
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
