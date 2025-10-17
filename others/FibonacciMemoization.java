package others;

import java.util.Arrays;

public class FibonacciMemoization {
    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        int fib = new FibonacciMemoization().Fibonacci(n, memo);
        System.out.println(fib);
    }

    private int Fibonacci(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        } else if (n == 0 || n == 1){
            return 1;
        }

        int result = Fibonacci(n - 1, memo) + Fibonacci(n - 2, memo);
        memo[n] = result;
        return result;
    }
}
