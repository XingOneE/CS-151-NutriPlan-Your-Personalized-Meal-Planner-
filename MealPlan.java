
public class MealPlan {

    private FoodItem[] foods;
    private int foodCapacity;
    private int foodIndex;

    /**
     * Constructor of meal plan
     */
    public MealPlan() {
        foods = new FoodItem[foodCapacity];
        foodCapacity = 10;
        foodIndex = 0;
        for (int i = 0; i < foodCapacity; i++) {
            foods[i] = new FoodItem();
        }

    }

    /**
     * Set the foods in meal plan
     * 
     * @param food the desired foods in meal plan
     */
    public void setFoods(FoodItem[] food) {
        foods = food;
    }

    /**
     * Set the food capacity
     * 
     * @param fc the desired food capacity
     */
    public void setFoodCapacity(int fc) {
        foodCapacity = fc;
    }

    /**
     * Get the foods in meal plan
     * 
     * @return foods the foods in meal plan
     */
    public FoodItem[] getFoods() {
        return foods;
    }

    /**
     * Get the food capacity of meal plan
     * 
     * @return foodCapacity the food capacity of meal plan
     */
    public int getFoodCapacity() {
        return foodCapacity;
    }

    /**
     * Adds food item to meal plan
     * 
     * @param food the desired food to add to meal plan
     */
    public void addFoodItem(FoodItem food) {
        foods[foodIndex++] = food;
        System.out.println("Added " + food.getName() + " to the meal plan.");
    }

    /**
     * Removes food item from meal plan
     * 
     * @param index the desired food to remove from meal plan
     */
    public void removeFoodItem(int index) {
        if (index >= 0 && index < foodCapacity && foods[index] != null) {
            String removedFoodName = foods[index].getName();
            foods[index] = null;
            System.out.println("Removed " + removedFoodName + " from the meal plan.");
        } else {
            System.out.println("Invalid food item index or no food item at the specified index.");
        }
    }

    /**
     * Displays the meal plan
     */
    public void displayMealPlan() {
        System.out.println("Meal Plan:");
        for (int i = 0; i < foodCapacity; i++) {
            System.out.println((i + 1) + ". " + foods[i].getName());
        }
    }

}