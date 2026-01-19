import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class StringTask {
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
        String s = next().toLowerCase();
        String vowels = "aoyeui";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result.append('.').append(s.charAt(i));
            }
        }
        pw.println(result);
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
