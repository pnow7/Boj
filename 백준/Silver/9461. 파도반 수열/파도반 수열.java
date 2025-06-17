import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long[] dp = new long[101];
		dp[1] = dp[2] = dp[3] = 1;
		
		for(int i = 4; i <= 100; i++) {
			dp[i] = dp[i-3] + dp[i-2];
		}
		
		for(int i = 0 ; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(dp[N]).append("\n");
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}
	
}
