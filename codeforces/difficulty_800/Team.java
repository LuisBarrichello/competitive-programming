package difficulty_800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int numOfProblems = Integer.parseInt(reader.readLine());

        int problemsToImplement = 0;
        for (int i = 0; i < numOfProblems; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            int petya = Integer.parseInt(stringTokenizer.nextToken());
            int vasya = Integer.parseInt(stringTokenizer.nextToken());
            int tonya = Integer.parseInt(stringTokenizer.nextToken());

            if (petya + vasya + tonya >= 2) {
                problemsToImplement++;
            }
        }
        pw.print(problemsToImplement);
        pw.flush();
        pw.close();
        reader.close();
    }
}
