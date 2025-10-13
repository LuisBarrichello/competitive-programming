package Template_with_snippets;

import java.io.*;
import java.util.*;
public class HelpfulMaths {
    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new OutputStreamWriter(System.out));

        solve();

        br.close();
        pw.close();
    }

    static void solve() throws IOException {
        String[] str = next().split("\\+");
        ArrayList<String> strings = new ArrayList<>(str.length);
        strings.addAll(Arrays.asList(str));
        Collections.sort(strings);
        String join = String.join("+", strings);
        pw.print(join);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

}
