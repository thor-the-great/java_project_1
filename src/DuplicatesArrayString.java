import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class DuplicatesArrayString {
    public static ArrayList<String> removeDuplicates(List<String> input) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.addAll(input);
        ArrayList<String> newList = new ArrayList<String>(treeSet);
        return newList;
    }
}
/*Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List
and returns an ArrayList of all the unique words.
The returned ArrayList should be lexically alphabetically.
 */


//Input: [Hi, Hello, Hey, Hi, Hello, Hey]

//Output: [Hello, Hey, Hi]
