// Write a recursive method fib(n) that returns the nth Fibonacci number.
// n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...,
// n == 0 should return 0 and n == 3 should return 2. Assume n is less than 15.
import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 0 to 15: ");
        int n = sc.nextInt();
        sc.close();
        //Map<Integer, Integer> cache = new HashMap<>();
        System.out.print(fib(n));
    }

    //public static int fib(int n, Map<Integer, Integer> cache) {
    public static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 2) + fib(n - 1);
    }

}
// if (n <= 1)
//        return n;
// int x = 0, y = 1, temp =0;
//  for (int i = 1; i < n; i++)
//    {
//      temp = x + y; // To Store previous two numbers
//      x = y;
//      y = temp;
//
//    }
//
//  return temp;
