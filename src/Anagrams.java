public class Anagrams {
    public static boolean isAnagram(String input1, String input2) {
        if(input1 == null || input2 == null || (input1.length() != input2.length())){
            return false;
        } else {
            int[] buffer = new int[26];
            for(int i=0; i < input1.length(); i++){
                buffer[input1.charAt(i) - 'a']++;
                buffer[input2.charAt(i) - 'a']--;
            }
            for(int j=0; j < buffer.length; j++){
                if(buffer[j] != 0) return false;
            }
            return true;
        }
    }
}
/*Write a method isAnagram that checks if two lowercase input Strings are anagrams of each other.
An anagram of a String is a String that is formed by simply re-arranging its letters, using each letter exactly once.
 Your algorithm should run in linear O(n) time and use constant O(1) space.
*/