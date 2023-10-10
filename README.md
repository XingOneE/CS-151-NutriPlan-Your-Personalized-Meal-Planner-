NutriPlan: Your Personalized Meal Planner

Members:
Kishitij Tyagi
Vincent Nguyen
Xing Yu Luo

Team 5 

1. Problem Statement: People are becoming more health-conscious and want to plan out their diet in a given week/month.

2. Solution: Our program will allow the user to plan and customize their meals for a specified time of day. They will be able to create time sections such as for breakfast or lunch and add foods to those sections. They can calculate the calories and nutrition from the information they submit. The user may also implement a budget for their meal plan, and the program will tell the user if their meal plan at a given time exceeds that budget.

3. Assumptions: 
a. The proposal assumes the user has the nutritional information and the cost for the food that they eat.
b. It assumes that the user is capable of inputting and managing the data for their meal plan.
c. It assumes that the program will have features for saving and editing meal plans over time.

4. The Features of our Meal Planner program:
Organize and customize meals through the week/month
Determine nutrition required for the user’s diet and health
Manage their budget for the food they buy
Keep track of the food they take in
Recommend the user certain food/food plans based on their preferences



5. Classes/methods we need for our program: 

a. Main: 
MealPlanner: the class that holds all other classes


b. OptionsMenu: the starting page to select the certain parts
FileReader: used to read a file created to keep track of the user’s meal plan. New plans can be created and written and pre-existing plans can be read/deleted.
readFile()
SaveFile()
deleteFile()


c. NutritionCalculator: determine the nutrition intake
calculateSugar()
calculateSodium()
calculateFiber()
calculateFat()

d. BudgetPlan: manages the amount of money implemented for a user’s meal plan
addBudget
distributeBudget()
doesExceedBudget()

e. Calendar: the space to hold the meal plans
createPlan()
deletePlan()
addCategory()
deleteCategory()
editCategory()

f. Plan (should be inherited)
DayPlan
WeekPlan
Goal: the end goal that the user sets
(Optional) User management: manage different meal plans for different users

6. When using the Meal Planner program, the user will first go to OptionMenu. Here they can select a variety of options:
Create meal plan,
Get meal plan for the day,
Nutritional Information,
View/Edit Meal Plan,
Set the Goal for the meal plan,   
Exit
