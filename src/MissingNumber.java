import java.util.HashSet;

//Given an Array containing 9 numbers ranging from 1 to 10,
// write a method to find the missing number.
// Assume you have 9 numbers between 1 to 10 and only one number is missing.
public class MissingNumber {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 4, 5, 6, 7};

        System.out.println(findMissingNumber(ar));
    }
    public static int findMissingNumber(int[] arr) {
    int realSum = 0;
    for (int arrElement : arr) {
        realSum = realSum + arrElement;
    }
    int N = arr.length + 1;
    int idealSum = (N*(N + 1)) / 2;
    return idealSum - realSum;
}
}