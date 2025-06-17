import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		/*
		 * int[] dp = new int[n]; 
		 * dp[0] = arr[0]; 
		 * int max = dp[0];
		 * 
		 * for(int i = 1; i < n; i++) { 
		 * 	   dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
		 * 	   max = Math.max(max, dp[i]); 
		 * }
		 */
		
		int sum = arr[0];
		int max = arr[0];
				
		for(int i = 1; i < n; i++) {
			sum = Math.max(arr[i],  sum + arr[i]);
			max = Math.max(max,  sum);
		}
		
		System.out.println(max);
		
		br.close();
	}
	
}
