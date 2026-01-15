import java.io.*;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;

public class TheatreSquare {
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
        long n = nextInt();
        long m = nextInt();
        long a = nextInt();

        long qntdd1 = Math.ceilDiv(n, a);
        long qntdd2 = Math.ceilDiv(m, a);

        pw.println(qntdd1 * qntdd2);

    }

    public static long nextInt() throws IOException {
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
