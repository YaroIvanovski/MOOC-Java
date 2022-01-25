
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.persons.get(0);
        for (Person prs: this.persons) {
            if (returnObject.getHeight() > prs.getHeight()) {
                returnObject = prs;
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        Person returnObject = shortest();
        this.persons.remove(returnObject);
        return returnObject;
    }
}