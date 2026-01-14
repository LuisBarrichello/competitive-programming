import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class KefaAndFirstSteps {
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
        int[] a = new int[n];
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            if (currentLength > maxLength) maxLength = currentLength;
        }

        pw.println(maxLength);
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
