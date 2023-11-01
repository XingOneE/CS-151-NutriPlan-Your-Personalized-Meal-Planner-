package package_a;

public class FoodItem {

	
	private String name = "null";
	private double price = 0.0;
	private double calories = 0.0;
	private double carbs = 0.0;
	private double protein = 0.0;
	private double fat = 0.0;
	private double sugar = 0.0;
	
	FoodItem()
	{
		name = "null";
		price = 0.0;
		calories = 0.0;
		carbs = 0.0;
		protein = 0.0;
		fat = 0.0;
		sugar = 0.0;
		
	}
	
	FoodItem(String n, double p)
	{
		super();
		name = n;
		price = p;
	}
	
	
	//setters:
	public void setName(String n)
	{
		name = n;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public void setCalories(double c)
	{
		calories = c;
	}
	
	public void setCarbs(double c)
	{
		carbs = c;
	}
	
	public void setProtein(double p)
	{
		protein = p;
	}
	
	public void setFat(double f)
	{
		fat = f;
	}
	
	public void setSugar(double s)
	{
		sugar = s;
	}
	
	//getters:
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getCalories()
	{
		return calories;
	}

	public double getCarbs()
	{
		return carbs;
	}
	
	public double getProtein()
	{
		return protein;
	}
	
	public double getFat()
	{
		return fat;
	}
	
	public double getSugar()
	{
		return sugar;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}