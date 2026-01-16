import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class YoungPhysicist {
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
        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            sumX += nextInt();
            sumY += nextInt();
            sumZ += nextInt();
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
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
