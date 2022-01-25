
import java.util.ArrayList;
import java.util.HashSet;
 
public class Menu {
    private ArrayList<String> meals;
 
    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) { 
        this.meals.add(meal);
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(meals);
        meals.clear();
        meals.addAll(hashSet);
    }
    
    public void printMeals() {
        for (String meal: this.meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
 