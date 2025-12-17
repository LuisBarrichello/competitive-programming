import java.io.*;
import java.util.*;

public class Puzzles {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new OutputStreamWriter(System.out));

        solve();

        pw.flush();
        br.close();
        pw.close();
    }

    private static void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();

        int[] pieces = new int[m];
        for (int i = 0; i < m; i++) {
            pieces[i] = nextInt();
        }

        Arrays.sort(pieces);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i + n - 1 < m; i++) {
            int diff = pieces[i + n - 1] - pieces[i];
            minDifference = Math.min(minDifference, diff);
        }

        pw.println(minDifference);
    }

    public static int nextInt() throws IOException {
        while(st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) {
                throw new NoSuchElementException("End of input stream reached.");
            }
            st = new StringTokenizer(line.trim());
        }
        return Integer.parseInt(st.nextToken());
    }
}
