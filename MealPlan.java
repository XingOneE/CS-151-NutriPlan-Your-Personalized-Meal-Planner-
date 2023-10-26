package package_a;

public class MealPlan {
	
    private FoodItem[] foods;
    private int foodCapacity = 10;

    public MealPlan() 
    {
        foods = new FoodItem[foodCapacity];
        
        for(int i = 0; i < foodCapacity; i++)
        {
        	foods[i] = new FoodItem();
        }
        
    }
    
    public void setFoods(FoodItem[] food)
	{
		foods = food;
	}
	
	public void setFoodCapacity(int fc)
	{
		foodCapacity = fc;
	}
	
	
	public FoodItem[] getFoods()
	{
		return foods;
	}
	
	public int getFoodCapacity()
	{
		return foodCapacity;
	}
    

    // Add a food item to the meal plan
    public void addFoodItem(FoodItem food) {
        for (int i = 0; i < foodCapacity; i++) {
            if (foods[i] == null) {
                foods[i] = food;
                System.out.println("Added " + food.getName() + " to the meal plan.");
                return;
            }
        }
        System.out.println("Meal plan is full. Cannot add more food items.");
    }

    // Remove a food item from the meal plan
    public void removeFoodItem(int index) {
        if (index >= 0 && index < foodCapacity && foods[index] != null) {
            String removedFoodName = foods[index].getName();
            foods[index] = null;
            System.out.println("Removed " + removedFoodName + " from the meal plan.");
        } else {
            System.out.println("Invalid food item index or no food item at the specified index.");
        }
    }

    // Display the contents of the meal plan
    public void displayMealPlan() {
        System.out.println("Meal Plan:");
        for (int i = 0; i < foodCapacity; i++) {
            if (foods[i] != null) {
                System.out.println((i + 1) + ". " + foods[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        MealPlan[] weeklyMealPlans = new MealPlan[7]; // Array to hold seven MealPlan objects, one for each day

        // Create MealPlan objects for each day of the week
        for (int i = 0; i < 7; i++) {
            weeklyMealPlans[i] = new MealPlan();
        }

        // Add, remove, and display food items in the meal plans
        //weeklyMealPlans[0].addFoodItem(new FoodItem("Chicken", 10.0, 250, 0, 30, 10, 0));
        // weeklyMealPlans[0].addFoodItem(new FoodItem("Rice", 2.0, 200, 45, 5, 1, 0));
        weeklyMealPlans[0].displayMealPlan();
        weeklyMealPlans[0].removeFoodItem(0);
        weeklyMealPlans[0].displayMealPlan();
    }
}