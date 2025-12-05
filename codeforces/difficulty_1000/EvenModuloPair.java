import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class EvenModuloPair {
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
        List<Integer> list = new ArrayList<>();
        List<Integer> candidates = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(nextInt());
        }

        for (int i = 0; i < n; i++) {
            int val = list.get(i);
            for (int j = 0; j < candidates.size(); j++) {
                if (val % candidates.get(j) % 2 == 0) {
                    pw.println(candidates.get(j) + " " + val);
                    return;
                }
            }
            candidates.add(val);
        }
        pw.println(-1);
    }

    static int nextInt() throws IOException {
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
