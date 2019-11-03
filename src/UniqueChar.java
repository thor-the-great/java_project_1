/*Write a method that takes in an input String and returns true if all the characters in the String
 are unique and false if there is even a single repeated character.
The method should return true if the input is null or empty String.*/

public class UniqueChar {
    public static void main(String[] args) {
    String str = "adgkle";
        System.out.println("All characters unique "+ areAllCharactersUnique(str));
    }
    public static boolean areAllCharactersUnique(String str){
        if (str == null || str.length() == 0) {
            return true;
        }

    int[] count = new int[128];
    for (char ch : str.toCharArray()) {
        count[ch] = count[ch] + 1;
        if (count[ch] > 1)
            return false;
    }
    return true;
    }
}
/*  Map<Character, Integer> count = new HashMap();
    for (char ch : str.toCharArray()) {
        if (count.containsKey(ch))
            count.put(ch, count.get(ch) + 1);
        else
            count.put(ch, 1);

        if (count.get(ch) > 1)
            return false;
    }
    return true; */