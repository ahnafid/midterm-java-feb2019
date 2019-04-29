package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Factorial factorial = new Factorial();
        long value = 5;
        long number = factorial.factorial(value);
        System.out.println(number);

    }

    public long factorial(long y) {
        long number = 1;
        for (long b = 1; b <= y; b++) {
            number = number * b;

        }
        return number;
    }
}