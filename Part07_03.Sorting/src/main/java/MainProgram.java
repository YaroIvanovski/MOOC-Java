
import java.util.Arrays;
 
public class MainProgram {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));
        System.out.println(Arrays.toString(array));
        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
        MainProgram.swap(array, 0, 2);
        System.out.println(Arrays.toString(array));
        MainProgram.sort(array);
    }
    
    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] <min)  {
                min = array[i];
            }    
        }
        return min;
    }
    
    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int index = 0;
        int min = array[index];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) { // table ---> array
        int minIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}