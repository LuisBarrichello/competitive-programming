import java.io.*;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;

public class Football {
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
        String[] players = next().split("");
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < players.length; i++) {
            if (Objects.equals(players[i], players[i - 1])) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) maxLength = currentLength;
        }

        if (maxLength >= 7) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
    }

    public static String next() throws IOException {
        while(st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) {
                throw new NoSuchElementException("End of input stream reached.");
            }
            st = new StringTokenizer(line.trim());
        }
        return st.nextToken();
    }
}
