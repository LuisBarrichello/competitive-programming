import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {
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
        int[] toys = new int[n];
        boolean hasEven = false, hasOdd = false;

        for (int i = 0; i < n; i++) {
            toys[i] = nextInt();
            if (toys[i] % 2 == 0) hasEven = true;
            else hasOdd = true;
        }

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (toys[i] < toys[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted || (hasEven && hasOdd)) Arrays.sort(toys);

        for (int i = 0; i < n; i++) {
            pw.println(toys[i] + " ");
        }

        pw.println();
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
