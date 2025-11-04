package Template_with_snippets;

import java.io.*;
import java.util.*;

public class SpyDetectedWithoutHashmap {
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

        if (arr[0] == arr[1]) {
            for (int i = 2; i < n; i++) {
                if (arr[i] != arr[0]) {
                    pw.println(i+1);
                    return;
                }
            }
        } else {
            if (arr[0] == arr[2]) pw.println(2);
            else pw.println(1);
        }
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
