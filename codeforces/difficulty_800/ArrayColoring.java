package Template_with_snippets;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayColoring {
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
        int n = nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        int total = Arrays.stream(arr).sum();

        pw.println (total % 2 == 0 ? "YES" : "NO");
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
