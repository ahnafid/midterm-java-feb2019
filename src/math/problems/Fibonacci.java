package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciK(40);

    }

    public void fibonacciK(int L) {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.println("Fibonacci number" + L);
        for (int h = 0; h <= L; h++) {
            System.out.println(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}