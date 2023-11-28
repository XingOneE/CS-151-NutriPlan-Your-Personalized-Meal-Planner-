package package_a;

import java.util.Scanner;

public class MealPlanManager {

    private MealPlan[] weeklyMealPlans;
    String day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satruday"};
    
    
    public void setMealPlan(MealPlan[] m)
    {
    	weeklyMealPlans = m;
    }
    
    public MealPlan[] getMealPlan()
    {
    	return weeklyMealPlans;
    }
    
    
    
    
    
    
    

    public MealPlanManager() 
    {
        weeklyMealPlans = new MealPlan[7];
        for (int i = 0; i < 7; i++) 
        {
            weeklyMealPlans[i] = new MealPlan();
        }
    }

    public void editMealPlan(int dayOfWeek, Scanner scan, Nutriplan np) 
    {
    	
    	boolean val = true;
    	int option = 0;
    	
    	String fName = "";
    	double fStats = 0;
    	int fInt = 0;
    	
    	while(val == true)
    	{
    		System.out.println(day[dayOfWeek] + "\n");
    		
    		System.out.println("Budget: $" + getMealPlan()[dayOfWeek].dayBudget);
        	System.out.println("Number of Items: " + getMealPlan()[dayOfWeek].getAmount());
        	getMealPlan()[dayOfWeek].display();
        	
        	System.out.println("\n Please select an option by inputing a #: \n");
        	
        	System.out.println("1. Add a food");
			System.out.println("2. Remove a food");
			System.out.println("3. Read Nutrition of Food");
			System.out.println("4. Exit (back to previous screen)");
			
			option = scan.nextInt();
			
			switch (option)
			{
				case 1:
				{
					FoodItem food = new FoodItem();
					
					System.out.println("Enter name of Food (no spaces): ");
					fName = scan.next();
					food.setName(fName);
					
					System.out.println("Price: ");
					fStats = scan.nextDouble();
					food.setPrice(fStats);
					
					System.out.println("Calories: ");
					fStats = scan.nextDouble();
					food.setCalories(fStats);
					
					System.out.println("Carbs: ");
					fStats = scan.nextDouble();
					food.setCarbs(fStats);
					
					System.out.println("Protein: ");
					fStats = scan.nextDouble();
					food.setProtein(fStats);
					
					System.out.println("Fat: ");
					fStats = scan.nextDouble();
					food.setFat(fStats);
					
					System.out.println("Sugar: ");
					fStats = scan.nextDouble();
					food.setSugar(fStats);
					
					getMealPlan()[dayOfWeek].addFoodItem(food, np);
					
					
					
					break;
				}
				case 2:
				{
					System.out.println("Select Food item by inputing a #:");
					fInt = scan.nextInt();
					
					if(fStats > 10 || fStats < 0)
					{
						System.out.println("Invalid option");
					}
					else if(getMealPlan()[dayOfWeek].getFoods()[fInt].getName() == "null")
					{
						System.out.println("Invalid option");
					}
					else
					{
						getMealPlan()[dayOfWeek].removeFoodItem(fInt - 1);
					}
					break;
				}
				case 3:
				{
					System.out.println("Select Food item by inputing a #:");
					fInt = scan.nextInt();
					
					if(fInt > 10 || fInt < 0)
					{
						System.out.println("Invalid option");
					}
					else if(getMealPlan()[dayOfWeek].getFoods()[fInt].getName() == "null")
					{
						System.out.println("Invalid option");
					}
					else
					{
						getMealPlan()[dayOfWeek].getFoods()[fInt - 1].displayNutrition();
					}
					
					break;
				}
				case 4:
				{
					val = false;
					break;
				}


			}
        	
    	}
    	
    	
    	
    }

    public void displayMealPlan(int dayOfWeek) 
    {
        if (dayOfWeek >= 0 && dayOfWeek < 7) 
        {
            System.out.println("Meal Plan for Day " + (dayOfWeek + 1) + " " + day[dayOfWeek] + ":");
            weeklyMealPlans[dayOfWeek].display();
        } 
        else 
        {
            System.out.println("Invalid day of the week.");
        }
    }
    
    public double getTotalCost()
    {
    	double total = 0;
    	
    	for(int i = 0; i < getMealPlan().length; i++)
		{
			
			for(int j = 0; j < getMealPlan()[i].getFoods().length; j++)
			{
				total += getMealPlan()[i].getFoods()[j].getPrice();
			}
			
		}
    	
    	
    	return total;
    }
    
    public double getTotalCals()
    {
    	double total = 0;
    	
    	for(int i = 0; i < getMealPlan().length; i++)
		{
			
			for(int j = 0; j < getMealPlan()[i].getFoods().length; j++)
			{
				total += getMealPlan()[i].getFoods()[j].getCalories();
			}
			
		}
    	
    	
    	return total;
    }
    
    public double getTotalCarbs()
    {
    	double total = 0;
    	
    	for(int i = 0; i < getMealPlan().length; i++)
		{
			
			for(int j = 0; j < getMealPlan()[i].getFoods().length; j++)
			{
				total += getMealPlan()[i].getFoods()[j].getCarbs();
			}
			
		}
    	
    	
    	return total;
    }
    
    public double getTotalProtein()
    {
    	double total = 0;
    	
    	for(int i = 0; i < getMealPlan().length; i++)
		{
			
			for(int j = 0; j < getMealPlan()[i].getFoods().length; j++)
			{
				total += getMealPlan()[i].getFoods()[j].getProtein();
			}
			
		}
    	
    	
    	return total;
    }
   
    public double getTotalFat()
    {
    	double total = 0;
    	
    	for(int i = 0; i < getMealPlan().length; i++)
		{
			
			for(int j = 0; j < getMealPlan()[i].getFoods().length; j++)
			{
				total += getMealPlan()[i].getFoods()[j].getFat();
			}
			
		}
    	
    	
    	return total;
    }
    
    public double getTotalSugar()
    {
    	double total = 0;
    	
    	for(int i = 0; i < getMealPlan().length; i++)
		{
			
			for(int j = 0; j < getMealPlan()[i].getFoods().length; j++)
			{
				total += getMealPlan()[i].getFoods()[j].getSugar();
			}
			
		}
    	
    	
    	return total;
    }
    
    
    public static void main(String[] args) 
    {
       
    }
}
    
