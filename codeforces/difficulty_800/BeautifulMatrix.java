package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class BeautifulMatrix {

    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        solve();

        pw.close();
        br.close();
    }

    static int solve() throws IOException {
        int[][] matrix = nextMatrix();
        int cordI = -1;
        int cordJ = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    cordI = i;
                    cordJ = j;
                }
            }
        }
        int moves = Math.abs(cordI - 2) + Math.abs(cordJ - 2);
        pw.print(moves);
        return moves;
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static int[] readLine() throws IOException {
        int[] line = new int[5];
        for (int i = 0; i < 5; i++) {
            line[i] = nextInt();
        }
        return line;
    }

    static int[][] nextMatrix() throws IOException {
        int[][] matrix = new int[5][5];
        for(int i = 0; i < 5; i++) {
            matrix[i] = readLine();
        }
        return matrix;
    }
}
