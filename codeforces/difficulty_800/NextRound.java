package difficulty_800;

// Problem: NextRound
// Source: https://codeforces.com/problemset/problem/158/A
// Difficulty: 800
// Tags: special problem\implementation
// Approach: 
// time limit per test: 3 second
// memory limit per test: 256 megabytes

// Input: The first line of the input contains two integers n and k (1≤k≤n≤50) separated by a single space.
//The second line contains n space-separated integers a1,a2,...,an (0≤ai≤100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n-1 the following condition is fulfilled: ai≥ai+1).
// Output: Output the number of participants who advance to the next round.

import java.io.*;
import java.util.StringTokenizer;

public class NextRound {

    // Fast I/O
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        solve();

        pw.close();
        br.close();
    }

    static void solve() throws IOException {
        // n -> num of total the participants
        // k -> the cutting position.
        // a -> list of scores (in non-ascending order).
        // rule: participant advance if score is positive and >= a[k]

        int n = nextInt();
        int k = nextInt();
        int[] a = nextIntArray(n);

        int threshold = a[k - 1];
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] >= threshold) {
                result++;
            }
        }

        pw.println(result);
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
