
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
   private List<Card> hand;
   
   public Hand() {
       this.hand = new ArrayList<>();
   }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> it = hand.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
       }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
  public int sumOfValue() {
        int sum = 0;
        for (Card card : hand) {
            sum += card.getValue();
        }
        return sum;
    }
   
   @Override
    public int compareTo(Hand otherHand) {
        return this.sumOfValue() - otherHand.sumOfValue();
    }
    
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
