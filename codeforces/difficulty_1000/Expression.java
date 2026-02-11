import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Expression {
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
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        int op1 = a + b + c;
        int op2 = a * b * c;
        int op3 = a + (b * c);
        int op4 = (a * b) + c;
        int op5 = a * (b + c);
        int op6 = (a + b) * c;

        int max = Math.max(op1, Math.max(op2, Math.max(op3, Math.max(op4, Math.max(op5, op6)))));

        pw.println(max);
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
