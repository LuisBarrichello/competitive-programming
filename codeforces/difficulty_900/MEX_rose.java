import java.io.*;
import java.util.StringTokenizer;

public class MEX_rose {
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
        int k = nextInt();
        int[] arr = new int[n];
        boolean[] k_view = new boolean[k];
        int excess_k = 0;
        int necessary = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        for (int x : arr) {
            if (x == k) excess_k++;
            else if (x < k) k_view[x] = true;
        }


        for (int i = 0; i < k; i++) {
            if (!k_view[i]) {
                necessary++;
            }
        }

        int result = Math.max(necessary, excess_k);

        pw.println(result);
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
