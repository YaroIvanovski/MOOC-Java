
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.numbers = new ArrayList<Integer>();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();
        
        while (this.numbers.size() < 7) {
            int num = random.nextInt(40) + 1;
            if (containsNumber(num)==false) {
                this.numbers.add(num);     
            }         
        }
    }

    public boolean containsNumber(int number) {
       if (this.numbers.contains(number)) {
            return true;
        } else {
            return false; 
       }
    }
}

