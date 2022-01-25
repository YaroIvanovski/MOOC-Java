
public class Main {
 
    public static void main(String[] args) {
        MessagingService message = new MessagingService();
        
        message.add(new Message("Part 6", "Programming exercise: MessagingService"));
        System.out.println(message.getMessages());
    }
}