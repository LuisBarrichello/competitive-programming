package Template_with_snippets;

import java.io.*;
import java.util.*;

public class SpyDetected {
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
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = nextInt();
            arr[i] = a;
            count.put(arr[i], count.getOrDefault(arr[i],0) + 1);
        }

        int spyValue = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                spyValue = entry.getKey();
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == spyValue) {
                pw.println(i + 1);
                return;
            }
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
