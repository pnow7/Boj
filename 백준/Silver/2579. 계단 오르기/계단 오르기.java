import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] dp = new int[T + 1];
		int[] arr = new int[T + 1];
		
		for(int i = 1; i <= T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		
		if(T >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		for(int i = 3; i <= T; i++) {
			dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
		}
		
		System.out.println(dp[T]);
		
		br.close();
	}
	
}