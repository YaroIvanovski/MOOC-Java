
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> directory;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        directory.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.directory.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        if (this.directory.containsKey(abbreviation)) {
            return directory.get(abbreviation);
        } else {
            return null;
        }
    }
}
