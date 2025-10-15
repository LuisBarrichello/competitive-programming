package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class StonesOnTheTable {
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
        int qntStones = Integer.parseInt(next());
        String colorsSequence = next();
        String[] ArrColorsSequence = colorsSequence.split("");
        int count = 0;

        for (int i = 0; i < ArrColorsSequence.length - 1; i++) {
            if (ArrColorsSequence[i].equals(ArrColorsSequence[i + 1])) {
                count++;
            }
        }
        pw.println(count);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }
}
