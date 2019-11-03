public class Palindrome {
    public static void main(String[] args) {
        String str = "krtbh";
        System.out.println(isStringPalindrome(str));
    }
    public static boolean isStringPalindrome(String str) {
        if (str == null) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
