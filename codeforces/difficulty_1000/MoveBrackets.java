import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class MoveBrackets {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }

        pw.flush();
        br.close();
        pw.close();
    }

    private static void solve() throws IOException {
        int n = nextInt();
        String s = next();

        int balance = 0;
        int moves = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(') {
                balance++;
            } else {
                if (balance > 0) {
                    balance--;
                } else {
                    moves++;
                }
            }
        }

        pw.println(moves);
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
