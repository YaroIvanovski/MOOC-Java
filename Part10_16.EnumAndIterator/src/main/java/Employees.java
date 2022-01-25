
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employee;
    
    public Employees() {
        this.employee = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employee.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) { 
        this.employee.addAll(peopleToAdd);
    }
    
    public void print() {
       Iterator<Person> it = employee.iterator();
       while(it.hasNext()) {
           System.out.println(it.next());
       }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employee.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education) ) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employee.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}