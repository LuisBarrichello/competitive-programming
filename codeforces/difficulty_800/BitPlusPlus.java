package Template_with_snippets;

// Problem: Bit++
// Source: https://codeforces.com/problemset/problem/282/A
// Difficulty: 800
// Tags: implementation
// Approach: the simple way is to verify if the operation have a "+" or "-", and increases or decreases.
// time limit per test: 1 second
// memory limit per test: 256 megabytes

// Input: The first line contains a single integer n (1 ≤ n ≤ 150) — the number of statements in the programme.
//  Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one
//  variable x (denoted as letter «X»). Thus, there are no empty statements.
//  The operation and the variable can be written in any order.
// Output: Print a single integer — the final value of x

import java.io.*;
import java.util.*;

public class BitPlusPlus {

    // Fast I/O
    static BufferedReader br;

    static {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        solve();

        pw.close();
        br.close();
    }

    static void solve() throws IOException {
        int n = nextInt();

        int x = 0;

        for (int i = 0; i < n; i++) {
            String op = next();

            if (op.contains("+")) {
                x++;
            } else {
                x--;
            }
        }

        pw.println(x);

    }

    // --- Utility methods for reading ---
    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static String nextLine() throws IOException {
        return br.readLine().trim();
    }

    // Methods to read arrays quickly
    static int[] nextIntArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    static long[] nextLongArray(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextLong();
        }
        return arr;
    }

    static double[] nextDoubleArray(int n) throws IOException {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextDouble();
        }
        return arr;
    }

}
