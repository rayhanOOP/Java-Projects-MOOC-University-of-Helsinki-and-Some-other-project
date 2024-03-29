
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random randomNum = new Random();
   
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        
        this.randomNum = new Random();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        
        int tmp ;
        while (this.numbers.size()<7) {
        
           
            tmp = this.randomNum.nextInt(39) + 1;
           
            if (!(containsNumber(tmp))) {
                this.numbers.add(tmp);
            }
            

        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number); 
    }
}
