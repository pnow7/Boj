import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    triangle[i][j] += triangle[i - 1][j]; 
                } else if (j == i) {
                    triangle[i][j] += triangle[i - 1][j - 1]; 
                } else {
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }
            }
        }

        int max = 0;
        for (int val : triangle[N - 1]) {
            max = Math.max(max, val);
        }

        System.out.println(max);
    }
}