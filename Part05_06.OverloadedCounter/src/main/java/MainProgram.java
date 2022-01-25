
public class MainProgram {
 
    public static void main(String[] args) {
        Counter counter = new Counter(900);
        counter.increase();
        counter.decrease();
        System.out.println(counter.value());
    }
}