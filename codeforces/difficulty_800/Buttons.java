package Template_with_snippets;

import java.io.*;
import java.util.*;

public class Buttons {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new OutputStreamWriter(System.out));
        int cases = nextInt();
        while (cases-- > 0) {
            solve();
        }
        pw.flush();
        br.close();
        pw.close();
    }
    static void solve() throws IOException {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        if (a > b) {
            pw.println("First");
        } else if (b > a) {
            pw.println("Second");
        } else {
            if (c % 2 == 1) pw.println("First");
            else pw.println("Second");
        }
    }

    static int nextInt() throws IOException {
        while(st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) {
                throw new java.util.NoSuchElementException("End of input stream reached.");
            }
            st = new StringTokenizer(line.trim());
        }
        return Integer.parseInt(st.nextToken());
    }
}
