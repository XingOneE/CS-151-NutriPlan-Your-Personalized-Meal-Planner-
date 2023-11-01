package package_a; 


public class MealPlanManager {

    private MealPlan[] weeklyMealPlans;
    
    private double calories;
    private double fat;
    private double protein;
    private double carbs;
    private double sugar;
    
    
    
    public void setMealPlan(MealPlan[] m)
    {
    	weeklyMealPlans = m;
    }
    
    public MealPlan[] getMealPlan()
    {
    	return weeklyMealPlans;
    }
    
    
    
    
    
    
    

    public MealPlanManager() {
        weeklyMealPlans = new MealPlan[7];
        for (int i = 0; i < 7; i++) {
            weeklyMealPlans[i] = new MealPlan();
        }
    }

    public void addFoodItem(int dayOfWeek, FoodItem food) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            weeklyMealPlans[dayOfWeek].addFoodItem(food);
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    public void removeFoodItem(int dayOfWeek, int index) 
    {
        if (dayOfWeek >= 0 && dayOfWeek < 7) 
        {
            weeklyMealPlans[dayOfWeek].removeFoodItem(index);
        } 
        else {
            System.out.println("Invalid day of the week.");
        }
    }

    public void displayMealPlan(int dayOfWeek) 
    {
        if (dayOfWeek >= 0 && dayOfWeek < 7) 
        {
            System.out.println("Meal Plan for Day " + (dayOfWeek + 1) + ":");
            weeklyMealPlans[dayOfWeek].displayMealPlan();
        } 
        else 
        {
            System.out.println("Invalid day of the week.");
        }
    }
    
    public void displayMacroGoals() {
        double tempCalories = 0;
        double tempFat = 0;
        double tempProtein = 0;
        double tempCarbs = 0;
        double tempSugar = 0;

        for (int i = 0; i < 7; i++) 
        {
        	for(int j = 0; j < weeklyMealPlans[i].getFoods().length; j++)
        	{
        		FoodItem item = weeklyMealPlans[i].getFoods()[j];
                tempCalories += item.getCalories();
                tempFat += item.getFat();
                tempProtein += item.getProtein();
                tempCarbs += item.getCarbs();
                tempSugar += item.getSugar();
        	}
        	
        }

        System.out.println("Calorie Goal: " + calories);
        System.out.println("Calorie Intake: " + tempCalories);
        System.out.println("Calorie Difference: " + (tempCalories - calories));

        System.out.println("Fat Goal: " + fat);
        System.out.println("Fat Intake: " + tempFat);
        System.out.println("Fat Difference: " + (tempFat - fat));

        System.out.println("Protein Goal: " + protein);
        System.out.println("Protein Intake: " + tempProtein);
        System.out.println("Protein Difference: " + (tempProtein - protein));

        System.out.println("Protein Goal: " + protein);
        System.out.println("Protein Intake: " + tempProtein);
        System.out.println("Protein Difference: " + (tempProtein - protein));

        System.out.println("Carbs Goal: " + carbs);
        System.out.println("Carbs Intake: " + tempCarbs);
        System.out.println("Catbs Difference: " + (tempCarbs - carbs));

        System.out.println("Sugar Goal: " + sugar);
        System.out.println("Sugar Intake: " + tempSugar);
        System.out.println("Sugar Difference: " + (tempSugar - sugar));
    }
    

    public static void main(String[] args) {
        //MealPlanManager manager = new MealPlanManager();

        // Adding and displaying food items for the first day
        // manager.addFoodItem(0, new FoodItem("Chicken", 10.0, 250, 0, 30, 10, 0));
        // manager.addFoodItem(0, new FoodItem("Rice", 2.0, 200, 45, 5, 1, 0);
        //manager.displayMealPlan(0);

        // Removing a food item from the first day
        //manager.removeFoodItem(0, 0);
        //manager.displayMealPlan(0);
    }
}
    
