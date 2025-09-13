import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[N][N];
		int S[][] = new int[N + 1][N + 1];
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				A[i - 1][j - 1] = Integer.parseInt(st1.nextToken());
				S[i][j] = S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1] + A[i - 1][j - 1];
			}
		}
		
		int sum = 0;
		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st2.nextToken());
			int y1 = Integer.parseInt(st2.nextToken());
			int x2 = Integer.parseInt(st2.nextToken());
			int y2 = Integer.parseInt(st2.nextToken());
			
			sum = S[x2][y2] - S[x2][y1 - 1] - S[x1 - 1][y2] + S[x1 - 1][y1 - 1];
			sb.append(sum).append("\n");
		}
		
		br.close();
		System.out.print(sb);

	}

}