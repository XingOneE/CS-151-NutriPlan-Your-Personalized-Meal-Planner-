
public class MealPlan {

    public class MealPlanner {

        private MealPlan[] weeklyMealPlans;
        private int daysInWeek = 7;
    
        public MealPlanner() {
            weeklyMealPlans = new MealPlan[daysInWeek];
            for (int i = 0; i < daysInWeek; i++) {
                weeklyMealPlans[i] = new MealPlan();
            }
        }
    
        // Get the meal plan for a specific day of the week
        public MealPlan getMealPlan(int day) {
            if (day >= 1 && day <= daysInWeek) {
                return weeklyMealPlans[day - 1]; // Subtract 1 to match array indexing
            }
            return null; // Invalid day
        }
    
        public static void main(String[] args) {
            // Example : 
            // Create a meal planner for the week
           // MealPlanner mealPlanner = new MealPlanner();
    
            // Example: Add a food item to the meal plan for Monday (day 1)
            //FoodItem food1 = new FoodItem("Chicken", 250, 12, 0, 30);
            // mealPlanner.getMealPlan(1).addFoodItem(food1);
    
            // Example: Display the meal plan for Monday
            // System.out.println("Meal Plan for Monday:");
            // mealPlanner.getMealPlan(1).displayMealPlan();
        }
    }


    
}
