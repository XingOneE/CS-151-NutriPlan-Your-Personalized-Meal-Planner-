package package_a;

import java.util.Scanner;

public class PersonalInfo {

	private String name = "";
	private int height = 1;
	private int weight = 1;
	private String[] allergies = new String[5];
	
	double budget;
	double calGoals;
	double carbGoals;
	double protGoals;
	double fatGoals;
	double sugGoals;
	
	
	PersonalInfo()
	{
		name = "null";
		height = 1;
		weight = 1;
		allergies = new String[5];
		
		for(int i = 0; i < allergies.length; i++)
		{
			allergies[i] = "none";
		}
		
		budget = 0;
		calGoals = 0;
		carbGoals = 0;
		protGoals = 0;
		fatGoals = 0;
		sugGoals = 0;
		
	}
	
	PersonalInfo(String n, int h, int w)
	{
		name = n;
		height = h;
		weight = w;
	}
	
	
	//setters
	public void setName(String n)
	{
		name = n;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public void setWeight(int w)
	{
		weight = w;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String[] getAllergies()
	{
		return allergies;
	}
	
	
	public void addAllergies(String a)
	{
		
		boolean room = true;
		int i = 0;
		
		while(room == true)
		{
			
			if(getAllergies()[i] == "none" || getAllergies()[i] == null)
			{
				getAllergies()[i] = a;
				room = false;
			}
			
			i++;
			
			if(i == 4)
			{
				room = false;
			}
			
		}
		
		
		
	}
	
	public void removeAllergies(int a)
	{
		if(a < 0 || a > 4)
		{
			System.out.println("Allergy " + getAllergies()[a] + " removed.");
			
			String empty = "none";
			getAllergies()[a] = empty;
		}
		else
		{
			System.out.println("Invalid index.");
		}
		
		
	}
	
	public void ReadAllergies()
	{
		for(int i = 0; i < allergies.length; i++)
		{
			System.out.println((i + 1) + ". " + allergies[i]);
		}
	}
	
	public void updateGoals(Scanner scan, Nutriplan np)
	{
		
		
		
		int option = 1;
		double value = 0;
		
		
		while(option >= 1 && option < 8)
		{
			System.out.println("Current Goals: \n");
			System.out.println("Set Budget: $" + budget);
			System.out.println("Budget after costs: $" + (budget - np.getMealPlanManager().getTotalCost()));
			
			System.out.println("\n Calroies: " + calGoals);
			System.out.println("Calroie difference: " + (calGoals - np.getMealPlanManager().getTotalCals()));
			
			System.out.println("\n Carbs: " + carbGoals);
			System.out.println("Carbs  difference: " + (carbGoals - np.getMealPlanManager().getTotalCarbs()));
			
			System.out.println("\n Protein: " + protGoals);
			System.out.println("Protein difference: " + (protGoals - np.getMealPlanManager().getTotalProtein()));
			
			System.out.println("\n Fat: " + fatGoals);
			System.out.println("Fat difference: " + (fatGoals - np.getMealPlanManager().getTotalFat()));
			
			System.out.println("\n Sugar: " + sugGoals);
			System.out.println("Sugar difference: " + (sugGoals - np.getMealPlanManager().getTotalSugar()));
			
			
			System.out.println("\n Please select an goal to update by inputing a #: \n");
			System.out.println("1. Update budget");
			System.out.println("2. Update Calorie Goal");
			System.out.println("3. Update Carbs Goal");
			System.out.println("4. Update Protein Goal");
			System.out.println("5. Update Fat Goal");
			System.out.println("6. Update Sugar Goal");
			System.out.println("7. Save and Exit (Go back to previous screen)");
			
			option = scan.nextInt();
			
			switch (option)
			{
				case 1:
				{
					System.out.println("Please enter in new value for the budget: ");
					value = scan.nextDouble();
					
					budget = value;
					

					break;
				}
				case 2:
				{
					System.out.println("Please enter in new value for the calorie goal: ");
					value = scan.nextDouble();
					
					calGoals = value;
					

					break;
				}
				case 3:
				{
					System.out.println("Please enter in new value for the carb goal: ");
					value = scan.nextDouble();
					
					carbGoals = value;
					

					break;
				}
				case 4:
				{
					System.out.println("Please enter in new value for the protein goal: ");
					value = scan.nextDouble();
					
					protGoals = value;
					

					break;
				}
				case 5:
				{
					System.out.println("Please enter in new value for the fat goal: ");
					value = scan.nextDouble();
					
					fatGoals = value;
					

					break;
				}
				case 6:
				{
					System.out.println("Please enter in new value for the sugar goal: ");
					value = scan.nextDouble();
					
					sugGoals = value;
					

					break;
				}
				case 7:
				{
					
					option = 10;	

					break;
				}
				
				
				
			}
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
