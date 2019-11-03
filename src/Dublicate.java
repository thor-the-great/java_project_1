import java.util.Arrays;
import java.util.TreeSet;

public class Dublicate {
   public static String duplicate(int[] numbers){
        TreeSet<Integer> result = new TreeSet<Integer>();
        // Sort the array
        Arrays.sort(numbers);
        //Iterate over the array
        for(int i = 1; i < numbers.length; i++) {
            // If previous element is the same as current, its the duplicate element
            if(numbers[i] == numbers[i - 1]) {
                result.add(numbers[i]);
            }
        }
        return result.toString();
    }
}
