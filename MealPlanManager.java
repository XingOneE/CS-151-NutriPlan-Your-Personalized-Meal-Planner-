
public class MealPlanManager {

    private MealPlan[] weeklyMealPlans;

    /**
     * Constructor for meal plan manager
     */
    public MealPlanManager() {
        weeklyMealPlans = new MealPlan[7];
        for (int i = 0; i < 7; i++) {
            weeklyMealPlans[i] = new MealPlan();
        }
    }

    /**
     * Sets new meal plans
     * 
     * @param m the desired meal plans
     */
    public void setMealPlan(MealPlan[] m) {
        weeklyMealPlans = m;
    }

    /**
     * Gets the meal plans
     * 
     * @return weeklyMealPlans the meal plans
     */
    public MealPlan[] getMealPlan() {
        return weeklyMealPlans;
    }

    /**
     * Adds food item to specific day of the week
     * 
     * @param dayOfWeek the desired day of the week, 0 for Sunday, 6 for Saturday
     * @param food      the desired food to add
     */
    public void addFoodItem(int dayOfWeek, FoodItem food) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            weeklyMealPlans[dayOfWeek].addFoodItem(food);
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    /**
     * Removes food item from specific day of the week
     * 
     * @param dayOfWeek the desired day of the week, 0 for Sunday, 6 for Saturday
     * @param index     the desired food to remove
     */
    public void removeFoodItem(int dayOfWeek, int index) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            weeklyMealPlans[dayOfWeek].removeFoodItem(index);
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    /**
     * Displays the meal plan of a specfic day
     * 
     * @param dayOfWeek the desired day to view meal plan
     */
    public void displayMealPlan(int dayOfWeek) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            System.out.println("Meal Plan for Day " + (dayOfWeek + 1) + ":");
            weeklyMealPlans[dayOfWeek].displayMealPlan();
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    /**
     * Displays the entire meal plan for the week
     */
    public void printEntireMealPlan() {

        for (int i = 0; i < 7; i++) {
            System.out.println("Displaying Meal Plan of Day " + (i + 1) + " of the Week");
            weeklyMealPlans[i].displayMealPlan();
        }

    }
}
