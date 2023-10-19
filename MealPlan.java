package package_a;

public class MealPlan {
    private FoodItem[] foods;
    private int foodCapacity = 10;
    private int foodCount;
    private String dayOfWeek;

    public MealPlan(String dayOfWeek) {
        foods = new FoodItem[foodCapacity];
        foodCount = 0;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    // Add a food item to the meal plan
    public void addFoodItem(FoodItem food) {
        if (foodCount < foodCapacity) {
            foods[foodCount] = food;
            foodCount++;
        } else {
            System.out.println("Meal plan is full. Cannot add more food items.");
        }
    }

    // Remove a food item from the meal plan
    public void removeFoodItem(int index) {
        if (index >= 0 && index < foodCount) {
            for (int i = index; i < foodCount - 1; i++) {
                foods[i] = foods[i + 1];
            }
            foods[foodCount - 1] = null; // Clear the last element
            foodCount--;
        } else {
            System.out.println("Invalid food item index.");
        }
    }

    // Display the contents of the meal plan
    public void displayMealPlan() {
        System.out.println("Meal Plan for " + dayOfWeek + ":");
        for (int i = 0; i < foodCount; i++) {
            System.out.println((i + 1) + ". " + foods[i].getName());
        }
    }
}
