import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Dragons {
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
        int strength = nextInt();
        int n = nextInt();
        int[][] dragons = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                dragons[i][j] = nextInt();
            }
        }

        Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            if (strength > dragons[i][0]) {
                strength += dragons[i][1];
            } else {
                pw.println("NO");
                return;
            }
        }

        pw.println("YES");
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
