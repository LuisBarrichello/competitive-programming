package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class WordCapitalization {
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

    static void solve() throws IOException {
        String str = next();
        if (str.isEmpty()) {
            pw.print("");
        }
        String result = str.substring(0, 1).toUpperCase().concat(str.substring(1, str.length()));
        pw.println(result);
    }

    static String next() throws IOException {
        while ( st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
}
