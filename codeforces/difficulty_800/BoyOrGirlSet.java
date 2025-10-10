package Template_with_snippets;

import java.io.*;
import java.util.*;

public class BoyOrGirlSet {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new OutputStreamWriter(System.out));

        solve();

        br.close();
        pw.close();
    }

    public static void solve() throws IOException {
        String str = next();
        String[] arrString = str.split("");
        Set<String> setChar = new HashSet<>(Arrays.asList(arrString));
        if (setChar.size() % 2 == 0) {
            pw.print("CHAT WITH HER!");
        } else {
            pw.print("IGNORE HIM!");
        }
        pw.print(setChar);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
}
