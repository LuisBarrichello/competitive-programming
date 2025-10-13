package Template_with_snippets;

import java.io.*;
import java.util.*;

public class HelpfulMathsHashMap {
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
        HashMap<String, Integer> countItems = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (!countItems.containsKey(str[i])) {
                countItems.put(str[i], 1);
            } else {
                countItems.put(str[i], countItems.get(str[i]) + 1);
            }
        }
        List<String> result = new ArrayList<>();
        for (String key : List.of("1", "2", "3")) {
            if (countItems.containsKey(key)) {
                int qtd = countItems.get(key);
                for (int i = 0; i < qtd; i++) {
                    result.add(key);
                }
            }
        }
        String output = String.join("+", result);
        pw.print(output);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

}
