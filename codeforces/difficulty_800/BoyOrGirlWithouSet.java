package Template_with_snippets;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BoyOrGirlWithouSet {
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
        String name = next();

        boolean[] seen = new boolean[26];
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            seen[c - 'a'] = true;
        }

        int count = 0;
        for (boolean letter : seen) {
            if (letter) count++;
        }

        if (count % 2 == 0) {
            pw.print("CHAT WITH HER!");
        } else {
            pw.print("IGNORE HIM!");
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
}
