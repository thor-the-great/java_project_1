

/*Given two strings - input1 and input2, determine if they are isomorphic.
Two strings are isomorphic if the letters in one string can be remapped to get the second string.
 Remapping a letter means replacing all occurrences of it with another letter.
 The ordering of the letters remains unchanged.
 You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape.
Target linear time and space complexity with your solution.
Input 1 : css
Input 2 : dll
Output  : true

Input 1 : css
Input 2 : dle
Output  : false
 */
import java.util.HashMap;
public class IsomorphicString {
    public static boolean isIsomorphic(String input1, String input2) {
        if(input1.length() != input2.length()) return false;
        else {
            HashMap<Character, Integer> hm1 = new HashMap<>();
            HashMap<Character, Integer> hm2 = new HashMap<>();
            for(int i=0; i < input1.length(); i++){
                Character c1 = input1.charAt(i);
                Integer val1 = hm1.get(c1) == null ? 1 : hm1.get(c1) + 1;
                hm1.put(c1,val1);

                Character c2 = input2.charAt(i);
                Integer val2 = hm2.get(c2) == null ? 1 : hm2.get(c2) + 1;
                hm2.put(c2,val2);

                if(!hm1.get(c1).equals(hm2.get(c2))) return false;
            }
            return true;
        }
    }
}
