package difficulty_800;

// Problem:
// Source: https://codeforces.com/problemset/problem/71/A
// Difficulty: 800
// Tags: strings
// Approach: get first and last letter of word, put the length of word less 2(first and last)
// time limit per test: 1 second
// memory limit per test: 256 megabytes
// input:  The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word.
//All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
// output: Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < n; i++) {
            String word = reader.readLine().trim();
            int length = word.length();

            if (length <= 10) {
                pw.println(word);
            } else {
                pw.println(
                        word.charAt(0) + String.valueOf(length - 2) + word.charAt(length - 1)
                );
            }
        }

        pw.flush();
        pw.close();
    }
}