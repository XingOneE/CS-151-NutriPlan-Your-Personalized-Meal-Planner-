package package_a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DataManager {

	
	DataManager()
	{
		
	}
	
	public void saveFile(Nutriplan profile) throws FileNotFoundException
	{
		//C:\Users\aweso\eclipse-workspace\Nutriplan_proto
		String directory = System.getProperty("user.dir");
		File newData = new File(directory + "\\NutriplanData");
		
		if(!newData.exists())
		{
			try 
			{
				newData.createNewFile();
			} 
			catch (IOException e) 
			{
				System.out.println("An error has occured.");
				e.printStackTrace();
			}
		}
		
		
		PrintWriter pen = new PrintWriter(newData);
		
		pen.print(profile.getPersonalInfo().getName());
		pen.print(" ");
		pen.print(profile.getPersonalInfo().getHeight());
		pen.print(" ");
		pen.print(profile.getPersonalInfo().getWeight());
		pen.print(" ");
		
		//allergies later
		
		//loops through mealPlan array in MealPLanManager (total of 7)
		for(int i = 0; i < profile.getMealPlanManager().getMealPlan().length; i++)
		{
			
			
			//loops through foods array in MealPlan (total of 10)
			for(int j = 0; j < profile.getMealPlanManager().getMealPlan()[i].getFoods().length; j++)
			{
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
		
		
		
		
		
		
		System.out.println("Save sucess.");
		

		pen.close();
		System.exit(0);
		
	}
	
	
	public void loadFile(String saveFile, Nutriplan profile) throws FileNotFoundException
	{
		
		File loadSave = new File(saveFile);		
		Scanner pen = new Scanner(loadSave);	
		
		
		String line = pen.nextLine();
		Scanner lineReader = new Scanner(line);
		
		profile.getPersonalInfo().setName(lineReader.next());
		profile.getPersonalInfo().setHeight(lineReader.nextInt());
		profile.getPersonalInfo().setWeight(lineReader.nextInt());
		
		
		//loops through mealPlan array in MealPLanManager (total of 7)
				for(int i = 0; i < profile.getMealPlanManager().getMealPlan().length; i++)
				{
					
					//loops through foods array in MealPlan (total of 10)
					for(int j = 0; j < profile.getMealPlanManager().getMealPlan()[i].getFoods().length; j++)
					{
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setName(lineReader.next());
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setPrice(lineReader.nextDouble());
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setCalories(lineReader.nextInt());
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setCarbs(lineReader.nextInt());
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setProtein(lineReader.nextInt());
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setFat(lineReader.nextInt());
						profile.getMealPlanManager().getMealPlan()[i].getFoods()[j].setSugar(lineReader.nextInt());
						
					}
					
					
				}
		
		
				System.out.println("Loading complete!");
				lineReader.close();
				pen.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		
		Nutriplan test = new Nutriplan();
		
		DataManager testSave = new DataManager();
		
		testSave.saveFile(test);
		
		
		
		
		
		
		

	}
	
	
	

}
