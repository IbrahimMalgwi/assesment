package written_test_question2;

public class Question2 {
    public static void main(String[] args) {
        LinkedList mealList = new LinkedList();

        Meal meal1 = new Meal("rice", 400);
        Meal meal2 = new Meal("beans", 600);
        Meal meal3 = new Meal("chips", 800);

        mealList.add(meal1);
        mealList.add(meal2);
        mealList.add(meal3);

        System.out.println(mealList.toString());


        Meal foundMeal = mealList.find("chips");
        if (foundMeal != null) {
            System.out.println("Found meal: " + foundMeal.toString());
        } else {
            System.out.println("Meal not found.");
        }

        mealList.remove(meal2);
        System.out.println(mealList.toString());
    }
}
