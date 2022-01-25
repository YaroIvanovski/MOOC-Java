
// For this program work, enough where there is +
 
public class List<Type> {                               // +
 
    private Type[] values;                                //   +
    private int firstFreeIndex;                          //    +
 
    public List() {                                              //   +
        this.values = (Type[]) new Object[10];    
        this.firstFreeIndex = 0;
    }
    
    /* 
    public void add(Type value) {                          //    +
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; 
    }
    
    */
 
    public void add(Type value) {
        if(this.firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    public Type value(int index) {                                   //  +
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }
    
    public int size() {                                                    //   +
        return this.firstFreeIndex;
    }
    
    // method increas the size of the array.
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
    
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    
    /*
    public boolean contains(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
    
    public void remove(Type value) {
        boolean found = false;
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (found) {
                this.values[i - 1] = this.values[i];
            } else if (value == this.values[i] || this.values[i].equals(value)) {
                this.firstFreeIndex--;
                found = true;
            }
        }
    }
    */
    
    // method searches for the index of the given value. The method returns -1 if the value is not found.
    private int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    // method moves values from the given index one place to the left.
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }
        
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
}