public class BinaryRepresentation {
    public static String computeBinary(int val) {
        // Base case: value is less than 2
        if (val < 2)
            return Integer.toString(val);
            // Recursive case: binary rep = binary of the header + last digit (odd/even)
        else {
            return computeBinary(val/2)+computeBinary(val%2);
        }
    }
}
