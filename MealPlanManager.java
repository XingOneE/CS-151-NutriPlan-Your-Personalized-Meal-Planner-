
public class MealPlanManager {

    private MealPlan[] weeklyMealPlans;

    public void setMealPlan(MealPlan[] m) {
        weeklyMealPlans = m;
    }

    public MealPlan[] getMealPlan() {
        return weeklyMealPlans;
    }

    public MealPlanManager() {
        weeklyMealPlans = new MealPlan[7];
        for (int i = 0; i < 7; i++) {
            weeklyMealPlans[i] = new MealPlan();
        }
    }

    public void addFoodItem(int dayOfWeek, FoodItem food) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            weeklyMealPlans[dayOfWeek].addFoodItem(food);
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    public void removeFoodItem(int dayOfWeek, int index) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            weeklyMealPlans[dayOfWeek].removeFoodItem(index);
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    public void displayMealPlan(int dayOfWeek) {
        if (dayOfWeek >= 0 && dayOfWeek < 7) {
            System.out.println("Meal Plan for Day " + (dayOfWeek + 1) + ":");
            weeklyMealPlans[dayOfWeek].displayMealPlan();
        } else {
            System.out.println("Invalid day of the week.");
        }
    }

    public void printEntireMealPlan() {

        for (int i = 0; i < 7; i++) {
            System.out.println("Displaying Meal Plan of Day " + (i + 1) + " of the Week");
            weeklyMealPlans[i].displayMealPlan();
        }

    }

    public static void main(String[] args) {
        // MealPlanManager manager = new MealPlanManager();

        // Adding and displaying food items for the first day
        // manager.addFoodItem(0, new FoodItem("Chicken", 10.0, 250, 0, 30, 10, 0));
        // manager.addFoodItem(0, new FoodItem("Rice", 2.0, 200, 45, 5, 1, 0);
        // manager.displayMealPlan(0);

        // Removing a food item from the first day
        // manager.removeFoodItem(0, 0);
        // manager.displayMealPlan(0);
    }
}
