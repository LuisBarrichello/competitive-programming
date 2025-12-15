import java.io.*;
import java.util.*;

public class Twins {
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
        List<Integer> values = new ArrayList<>();
        int mySum = 0;
        int countCoins = 0;

        for (int i = 0; i < n; i++) {
            values.add(nextInt());
        }

        Collections.sort(values);
        int sumTotal = values.stream().reduce(0, Integer::sum );

        for (int i = n - 1; i >= 0; i--) {
            mySum += values.get(i);
            countCoins++;
            if (mySum > (sumTotal / 2)) {
                break;
            }
        }

        pw.println(countCoins);
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
