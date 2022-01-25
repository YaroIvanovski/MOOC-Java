
public class Program {

    public static void main(String[] args) {
        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add(" World !");
        
        for(int i = 0; i < myList.size(); i++) {
            System.out.print(myList.value(i));
        }
    }
}
