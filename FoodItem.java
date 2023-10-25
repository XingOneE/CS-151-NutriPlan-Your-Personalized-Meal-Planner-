package package_a;

public class FoodItem {

	private String name;
	private double price;
	private double calories;
	private double carbs;
	private double protein;
	private double fat;
	private double sugar;

	FoodItem() {
		name = "null";
		price = 0.0;
		calories = 0;
		carbs = 0;
		protein = 0;
		fat = 0;
		sugar = 0;
	}

	FoodItem(String name, double price, double calories, double carbs, double protein, double fat, double sugar) {

		this.name = name;
		this.price = price;
		this.calories = calories;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
		this.sugar = sugar;
	}

	FoodItem(String n, double p) {
		super();
		name = n;
		price = p;
		price = 0.0;
		calories = 0;
		carbs = 0;
		protein = 0;
		fat = 0;
		sugar = 0;
	}

	// setters:
	public void setName(String n) {
		name = n;
	}

	public void setPrice(double p) {
		price = p;
	}

	public void setCalories(int c) {
		calories = c;
	}

	public void setCarbs(int c) {
		carbs = c;
	}

	public void setProtein(int p) {
		protein = p;
	}

	public void setFat(int f) {
		fat = f;
	}

	public void setSugar(int s) {
		sugar = s;
	}

	// getters:

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getCalories() {
		return calories;
	}

	public double getCarbs() {
		return carbs;
	}

	public double getProtein() {
		return protein;
	}

	public double getFat() {
		return fat;
	}

	public double getSugar() {
		return sugar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}