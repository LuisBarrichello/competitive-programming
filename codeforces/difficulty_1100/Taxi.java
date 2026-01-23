import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Taxi {
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
        int[] counts = new int[5];

        for (int i = 0; i < n; i++) {
            counts[nextInt()]++;
        }

        int totalTaxis = 0;

        totalTaxis += counts[4];
        totalTaxis += counts[3];
        counts[1] = Math.max(0, counts[1] - counts[3]);
        totalTaxis += counts[2] / 2;
        if (counts[2] % 2 == 1) {
            totalTaxis++;
            counts[1] = Math.max(0, counts[1] - 2);
        }

        if (counts[1] > 0) {
            totalTaxis += Math.ceilDiv(counts[1], 4);
        }

        pw.println(totalTaxis);
    }

    private static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) {
                throw new NoSuchElementException("End of input stream reached.");
            }
            st = new StringTokenizer(line.trim());
        }
        return Integer.parseInt(st.nextToken());
    }
}
