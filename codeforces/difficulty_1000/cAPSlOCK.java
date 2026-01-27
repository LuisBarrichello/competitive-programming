import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class cAPSlOCK {
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
        String s = next();
        boolean mustReverse = true;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                mustReverse = false;
                break;
            }
        }

        if (mustReverse) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            pw.println(result);
        } else {
            pw.println(s);
        }
    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) {
                throw new NoSuchElementException("End of input stream reached.");
            }
            st = new StringTokenizer(line.trim());
        }
        return st.nextToken();
    }
}
