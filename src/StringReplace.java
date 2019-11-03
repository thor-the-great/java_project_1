
//Write a method to replace all spaces in a string with a given replacement string.

public class StringReplace {
    public static void main(String[] args) {
        String a = "My name is Maria";
        String b = "/";
        System.out.println(replace(a, b));
    }

    public static String replace(String a, String b) {
        char[] chars = a.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (chars[i] == ' ') {
                sb.append(b);
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
