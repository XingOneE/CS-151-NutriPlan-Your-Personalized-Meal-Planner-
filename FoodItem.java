package package_a;

public class FoodItem {

	private String name;
	private double price;
	private int calories;
	private int carbs;
	private int protein;
	private int fat;
	private int sugar;

	/**
	 * Default constructor for food item
	 */
	FoodItem() {
		name = "null";
		price = 0.0;
		calories = 0;
		carbs = 0;
		protein = 0;
		fat = 0;
		sugar = 0;
	}

	/**
	 * Constructor for food item with information of macros
	 * 
	 * @param name     the name of food item
	 * @param price    the price of food item
	 * @param calories the calories in food item
	 * @param carbs    the carbs in food item
	 * @param protein  the protein in food item
	 * @param fat      the fat in food item
	 * @param sugar    the sugar in food item
	 */
	FoodItem(String name, double price, int calories, int carbs, int protein, int fat, int sugar) {
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
		this.sugar = sugar;
	}

	/**
	 * Constructor for food item with information on price
	 * 
	 * @param n the name of food item
	 * @param p the price of food item
	 */
	FoodItem(String n, double p) {
		super();
		name = n;
		price = p;
	}

	/**
	 * Sets the name of food item
	 * 
	 * @param n the new desired name of food item
	 */
	public void setName(String n) {
		name = n;
	}

	/**
	 * Sets the price of food item
	 * 
	 * @param p the new desired price of food item
	 */
	public void setPrice(double p) {
		price = p;
	}

	/**
	 * Sets the calorie of food item
	 * 
	 * @param c the new desired calorie of food item
	 */
	public void setCalories(int c) {
		calories = c;
	}

	/**
	 * Sets the carbs of food item
	 * 
	 * @param c the new desired carbs of food item
	 */
	public void setCarbs(int c) {
		carbs = c;
	}

	/**
	 * Sets the protein of food item
	 * 
	 * @param p the new desired protein of food item
	 */
	public void setProtein(int p) {
		protein = p;
	}

	/**
	 * Sets the fat of food item
	 * 
	 * @param f the new desired fat of food item
	 */
	public void setFat(int f) {
		fat = f;
	}

	/**
	 * Sets the sugar of food item
	 * 
	 * @param s the new desired sugar of food item
	 */
	public void setSugar(int s) {
		sugar = s;
	}

	/**
	 * Gets the name of food item
	 * 
	 * @return name the name of food item
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the price of food item
	 * 
	 * @return price the price of food item
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets the calories of food item
	 * 
	 * @return calories the calories of food item
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Gets the carbs of food item
	 * 
	 * @return carbs the carbs of food item
	 */
	public int getCarbs() {
		return carbs;
	}

	/**
	 * Gets the protein of food item
	 * 
	 * @return protein the protein of food item
	 */
	public int getProtein() {
		return protein;
	}

	/**
	 * Gets the fat of food item
	 * 
	 * @return fat the fat of food item
	 */
	public int getFat() {
		return fat;
	}

	/**
	 * Gets the sugar of food item
	 * 
	 * @return sugar the sugar of food item
	 */
	public int getSugar() {
		return sugar;
	}

	/**
	 * Displays nutrition of food item
	 */
	public void displayNutrition() {
		System.out.println("(" + getName() + ") Nutritional Facts: \n");
		System.out.println("$" + getPrice());
		System.out.println("Calories: " + getCalories());
		System.out.println("carbs: " + getCarbs());
		System.out.println("Protein: " + getProtein());
		System.out.println("Fat: " + getFat());
		System.out.println("Sugar: " + getSugar());
	}
}