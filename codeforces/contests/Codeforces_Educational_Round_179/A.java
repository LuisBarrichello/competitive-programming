import java.io.*;
import java.util.*;

public class A {

    static BufferedReader br;
    static PrintWriter pw;
    static StringTokenizer st;

    static class State {
        int[] crystals;
        int actions;

        State(int[] c, int a) {
            this.crystals = Arrays.copyOf(c, c.length);
            Arrays.sort(this.crystals);
            this.actions = a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return Arrays.equals(crystals, state.crystals);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(crystals);
        }
    }

    static boolean isValidState(int[] c, int targetXValue) {
        for (int val : c) {
            if (val < 0 || val > targetXValue) return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (c[i] < c[j] / 2) {
                    return false;
                }
            }
        }
        return true;
    }

    static int solve() throws IOException {
        int x = nextInt();
        if (x == 0) {
            return 0;
        }

        Queue<State> queue = new LinkedList<>();
        Set<State> visited = new HashSet<>();

        int[] initialCrystalsArray = {0, 0, 0};

        State initialState = new State(initialCrystalsArray, 0);

        queue.offer(initialState);
        visited.add(initialState);

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.crystals[0] == x && current.crystals[1] == x && current.crystals[2] == x) {
                return current.actions;
            }

            for (int i = 0; i < 3; i++) { // 'i' representa qual dos 3 valores no array ORDENADO 'current.crystals' será a base para a mudança
                int valueToChange = current.crystals[i];

                Set<Integer> candidateTargetLevels = new HashSet<>();
                candidateTargetLevels.add(x);

                for (int j = 0; j < 3; j++) {
                    if (i == j) continue;
                    int otherVal = current.crystals[j];
                    candidateTargetLevels.add(otherVal);      // Tentar igualar
                    candidateTargetLevels.add(otherVal * 2);
                    candidateTargetLevels.add(otherVal * 2 + 1);
                }
                if (i == 0) {
                    candidateTargetLevels.add(current.crystals[1]);
                    candidateTargetLevels.add(current.crystals[2]);
                } else if (i == 1) {
                    candidateTargetLevels.add(current.crystals[0]);
                    candidateTargetLevels.add(current.crystals[2]);
                } else { // i == 2
                    candidateTargetLevels.add(current.crystals[0]);
                    candidateTargetLevels.add(current.crystals[1]);
                }


                for (int targetLevel : candidateTargetLevels) {
                    if (targetLevel <= valueToChange || targetLevel > x) {
                        continue;
                    }

                    int[] nextCrystalsAttempt = new int[3];
                    int tempIdx = 0;
                    for (int k = 0; k < 3; k++) {
                        if (k == i) { // Posição do valor que estamos mudando
                            nextCrystalsAttempt[tempIdx++] = targetLevel;
                        } else {
                            nextCrystalsAttempt[tempIdx++] = current.crystals[k];
                        }
                    }

                    int[] correctlyFormedNextCrystals = new int[3];
                    int currentWriteIndex = 0;
                    for(int k=0; k < 3; k++) {
                        if (k != i) {
                            correctlyFormedNextCrystals[currentWriteIndex++] = current.crystals[k];
                        }
                    }
                    correctlyFormedNextCrystals[currentWriteIndex] = targetLevel;

                    if (isValidState(correctlyFormedNextCrystals, x)) {
                        State nextState = new State(correctlyFormedNextCrystals, current.actions + 1);
                        if (!visited.contains(nextState)) {
                            visited.add(nextState);
                            queue.offer(nextState);
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = nextInt();
        while (t-- > 0) {
            pw.println(solve());
        }
        pw.flush(); // Importante para garantir que a saída seja escrita
        br.close();
        pw.close();
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static String nextLine() throws IOException {
        return br.readLine().trim();
    }

    static int[] nextIntArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        return arr;
    }

    static long[] nextLongArray(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextLong();
        }
        return arr;
    }

    static double[] nextDoubleArray(int n) throws IOException {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextDouble();
        }
        return arr;
    }
}