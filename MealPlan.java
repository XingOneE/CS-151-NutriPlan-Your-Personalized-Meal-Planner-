package package_a;

public class MealPlan {
	
    private FoodItem[] foods;
    private int foodCapacity = 10;
    int amount = 0;

    public MealPlan() 
    {
        foods = new FoodItem[foodCapacity];
        
        for(int i = 0; i < foodCapacity; i++)
        {
        	foods[i] = new FoodItem();
        }
        
        amount = 0;
        
    }
    
    public void setFoods(FoodItem[] food)
	{
		foods = food;
	}
	
	public void setFoodCapacity(int fc)
	{
		foodCapacity = fc;
	}
	
	public void setAmount(int a)
	{
		amount = a;
	}
	
	
	public FoodItem[] getFoods()
	{
		return foods;
	}
	
	public int getFoodCapacity()
	{
		return foodCapacity;
	}
	
	public int getAmount()
	{
		return amount;
	}
    

    // Add a food item to the meal plan
    public void addFoodItem(FoodItem food) 
    {
        for (int i = 0; i < foodCapacity; i++) 
        {
            if (foods[i].getName() == "null") 
            {
                foods[i] = food;
                System.out.println("Added " + food.getName() + " to the meal plan.");
                amount++;
                return;
            }
        }
        System.out.println("Meal plan is full. Cannot add more food items.");
    }

    // Remove a food item from the meal plan
    public void removeFoodItem(int index) 
    {
        if (index >= 0 && index < foodCapacity && foods[index] != null) 
        {
        	FoodItem empty = new FoodItem();
        	
            String removedFoodName = foods[index].getName();
            foods[index] = empty;
            System.out.println("Removed " + removedFoodName + " from the meal plan.");
        } 
        else 
        {
            System.out.println("Invalid food item index or no food item at the specified index.");
        }
    }

    // Display the contents of the meal plan
    public void display() 
    {
        System.out.println("Meal Plan:");
        
        for (int i = 0; i < foodCapacity; i++)
        {
            if (foods[i].getName().equals("null") == false) 
            {
                System.out.println((i + 1) + ". " + foods[i].getName());
            }
            else
            {
            	System.out.println((i + 1) + ". ");
            }
        }
    }

    public static void main(String[] args) 
    {
        
    }
}
