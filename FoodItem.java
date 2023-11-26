
public class FoodItem {

	private String name;
	private double price;
	private int calories;
	private int carbs;
	private int protein;
	private int fat;
	private int sugar;

	FoodItem() {
		name = "null";
		price = 0.0;
		calories = 0;
		carbs = 0;
		protein = 0;
		fat = 0;
		sugar = 0;
	}

	FoodItem(String name, double price, int calories, int carbs, int protein, int fat, int sugar) {
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

	public int getCalories() {
		return calories;
	}

	public int getCarbs() {
		return carbs;
	}

	public int getProtein() {
		return protein;
	}

	public int getFat() {
		return fat;
	}

	public int getSugar() {
		return sugar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}