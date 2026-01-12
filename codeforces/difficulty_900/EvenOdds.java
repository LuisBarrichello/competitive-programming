import java.io.*;
import java.util.*;

public class EvenOdds {
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
        long n = nextLong();
        long k = nextLong();
        long participation = (n + 1) / 2;
        long result;

        if (k <= participation) {
            result = (k * 2) - 1;
        } else {
            result = 2 * (k - participation);
        }
        pw.println(result);
    }

    public static long nextLong() throws IOException {
        while(st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) {
                throw new NoSuchElementException("End of input stream reached.");
            }
            st = new StringTokenizer(line.trim());
        }
        return Long.parseLong(st.nextToken());
    }
}
