import java.util.HashMap;

public class CoupleSum {
    public static int[] coupleSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < numbers.length; i++){
            int n = numbers[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n), i+1};
            } else {
                map.put(target-n, i+1);
            }
        }
        return null;
    }
}
 /*Given an array of integers, find two numbers such that they sum up to a specific target.
The method coupleSum should return the indices of the two numbers in the array,
 where index1 must be less than index2.
Please note that the indices are not zero based, and you can assume that each input has exactly one solution.
Target linear runtime and space complexity.
  */