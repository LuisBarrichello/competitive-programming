package Template_with_snippets;

import java.io.*;
import java.util.StringTokenizer;

public class Elephant {
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
        int coordinateFriend = nextInt();
        int myCoordinate = 0;
        int countSteps = 0;

        while (myCoordinate < coordinateFriend) {
            if (coordinateFriend >= 5) {
                myCoordinate += 5;
            } else if (coordinateFriend == 4) {
                myCoordinate += 4;
            } else if (coordinateFriend == 3) {
                myCoordinate += 3;
            } else if (coordinateFriend == 2) {
                myCoordinate += 2;
            } else {
                myCoordinate++;
            }
            countSteps++;
        }

        pw.println(countSteps);
    }

    static int nextInt () throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return Integer.parseInt(st.nextToken());
    }
}
