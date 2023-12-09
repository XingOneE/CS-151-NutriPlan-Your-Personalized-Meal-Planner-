package package_a;

public class MealPlan {

    private FoodItem[] foods;
    private int foodCapacity;
    int amount;
    double dayBudget;

    /**
     * Constructor of meal plan
     */
    public MealPlan() {
        foods = new FoodItem[foodCapacity];
        foodCapacity = 10;

        for (int i = 0; i < foodCapacity; i++) {
            foods[i] = new FoodItem();
        }

        amount = 0;
        dayBudget = 0;

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
     * Set the amount
     * 
     * @param a the desired amount
     */
    public void setAmount(int a) {
        amount = a;
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
     * Get the amount of meal plan
     * 
     * @return amount the amount of the meal plan
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Adds food item to meal plan in desired nutriplan
     * 
     * @param food the desired food to add to meal plan
     * @param np   the desired nutriplan to add to
     */
    public void addFoodItem(FoodItem food, Nutriplan np) {
        for (int i = 0; i < foodCapacity; i++) {

            if (np.getMealPlanManager().getTotalCost() + food.getPrice() > np.getPersonalInfo().budget) {
                System.out.println("The cost of " + food.getName() + " ($" + food.getPrice() + ") exceeds the budget.");
                return;
            } else if (np.getMealPlanManager().getTotalCals() + food.getCalories() > np.getPersonalInfo().calGoals) {
                System.out.println("The calories of " + food.getName() + " exceeds the Calorie Goal.");
                return;
            } else if (np.getMealPlanManager().getTotalCarbs() + food.getCarbs() > np.getPersonalInfo().carbGoals) {
                System.out.println("The carbs of " + food.getName() + " exceeds the Calorie Goal.");
                return;
            } else if (np.getMealPlanManager().getTotalProtein() + food.getProtein() > np.getPersonalInfo().protGoals) {
                System.out.println("The protien of " + food.getName() + " exceeds the Calorie Goal.");
                return;
            } else if (np.getMealPlanManager().getTotalFat() + food.getFat() > np.getPersonalInfo().fatGoals) {
                System.out.println("The fat of " + food.getName() + " exceeds the Calorie Goal.");
                return;
            } else if (np.getMealPlanManager().getTotalSugar() + food.getSugar() > np.getPersonalInfo().sugGoals) {
                System.out.println("The sugar of " + food.getName() + " exceeds the Calorie Goal.");
                return;
            } else if (foods[i].getName().equals("null")) {
                foods[i] = food;
                System.out.println("Added " + food.getName() + " to the meal plan.");
                amount++;
                dayBudget += food.getPrice();
                System.out.println("Item sucessfully added.");
                return;
            }

        }
        System.out.println("Meal plan is full. Cannot add more food items.");
    }

    /**
     * Removes food item from meal plan
     * 
     * @param index the desired food to remove from meal plan
     */
    public void removeFoodItem(int index) {
        if (index >= 0 && index < foodCapacity && foods[index].getName().equals("null") == false) {
            FoodItem empty = new FoodItem();

            String removedFoodName = foods[index].getName();
            foods[index] = empty;
            amount--;
            dayBudget--;
            System.out.println("Removed " + removedFoodName + " from the meal plan.");
        } else {
            System.out.println("Invalid food item index or no food item at the specified index.");
        }
    }

    /**
     * Displays the meal plan
     */
    public void display() {
        System.out.println("Meal Plan:");

        for (int i = 0; i < foodCapacity; i++) {
            if (foods[i].getName().equals("null") == false) {
                System.out.println((i + 1) + ". " + foods[i].getName());
            } else {
                System.out.println((i + 1) + ". ");
            }
        }
    }
}