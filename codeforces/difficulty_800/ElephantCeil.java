package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class ElephantCeil {
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
        int coordinateFriend = nextInt();
        int countSteps = (coordinateFriend + 4) / 5;
        pw.println(countSteps);
    }

    static int nextInt () throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return Integer.parseInt(st.nextToken());
    }
}
