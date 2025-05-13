package difficulty_800;

// Problem: A. Watermelon
// Source: https://codeforces.com/problemset/problem/4/A
// Difficulty: 800
// Tags: math, brute force
// Approach: Check if input is even and > 2
// time limit per test: 1 second
// memory limit per test: 64 megabytes

// Input: The first (and the only) input line contains integer number w (1 ≤ w ≤ 100)
// — the weight of the watermelon bought by the boys.
// Output: Print YES, if the boys can divide the watermelon into two parts,
// each of them weighing even number of kilos; and NO in the opposite case.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));;
        PrintWriter printWriter = new PrintWriter(System.out);

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int kilos = Integer.parseInt(stringTokenizer.nextToken());

        if (kilos > 2 && kilos % 2 == 0) {
            printWriter.print("YES");
        } else {
            printWriter.print("NO");
        }
        printWriter.close();
    }
}
