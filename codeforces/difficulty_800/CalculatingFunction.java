package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class CalculatingFunction {
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
        Long n = nextInt();
        if (n % 2 == 0) {
            pw.println(n/2);
        } else {
            pw.println(-(n+1)/2);
        }
    }

    static Long nextInt() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return Long.parseLong(st.nextToken());
    }
}
