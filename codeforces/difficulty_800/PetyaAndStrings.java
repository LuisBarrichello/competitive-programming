package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class PetyaAndStrings {
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
        String str1 = nextString().toLowerCase();
        String str2 = nextString().toLowerCase();
        int expression = str1.compareTo(str2);
        int result;
        if (expression > 0) {
            result = 1;
        } else if (expression < 0) {
            result = -1;
        } else {
            result = 0;
        }
        pw.print(result);
    }

    static String nextString() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

}
