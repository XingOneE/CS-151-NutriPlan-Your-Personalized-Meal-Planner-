package package_a;

public class MealPlan {

	private FoodItem[] foods;
	private int foodCapacity = 10;
	
	
	MealPlan()
	{
		FoodItem empty = new FoodItem();
		
		for(int i = 0; i < getFoodCapacity(); i++)
		{
			getFoods()[i] = empty;
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
	
	
	
	public void readMealInfo()
	{
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
