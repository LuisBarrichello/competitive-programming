package Template_with_snippets;

import java.io.*;
import java.util.*;

public class BearAndBigBrother {
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

    static void solve () throws IOException {
        int a = nextInt();
        int b = nextInt();
        int countYears = 0;

        while (a <= b) {
            a = a * 3;
            b = b * 2;
            countYears++;
        }
        pw.println(countYears);
    }

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }

        return Integer.parseInt(st.nextToken());
    }
}
