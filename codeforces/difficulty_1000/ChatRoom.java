import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ChatRoom {
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
        String target = "hello";
        int targetIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }

            if (targetIndex == 5) {
                break;
            }
        }

        pw.println(targetIndex == 5 ? "YES" : "NO");
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
