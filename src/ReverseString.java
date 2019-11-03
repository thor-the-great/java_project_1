//Write a method that takes in a String and returns the reversed version of the String.

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        input.close();

        System.out.print(reverseStr(str));

    }


    public static String reverseStr(String str) {

        StringBuilder sb = new StringBuilder();

        if ( str == null){
            return null;
        }
        else{
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

}

// * using String.toCharArrey() method:
// if (str == null)
//        return null;
//    int l = 0;
//    int r = str.length() - 1;
//    char[] chArr = str.toCharArray();
//    while (l < r) {
//        char temp = chArr[l];
//        chArr[l] = chArr[r];
//        chArr[r] = temp;
//        l++;
//        r--;
//    }
//    return String.copyValueOf(chArr);
//