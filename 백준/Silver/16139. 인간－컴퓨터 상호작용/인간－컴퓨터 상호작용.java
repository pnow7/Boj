import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String S = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		
		int[][] prefixSum = new int[26][S.length() + 1];
		for(int i = 0; i <S.length(); i++) {
			for(int j = 0; j < 26; j++) {
				prefixSum[j][i + 1] = prefixSum[j][i];
			}
			prefixSum[S.charAt(i) - 'a'][i + 1]++;
			
		}
		
		StringTokenizer st;
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			char alpha = st.nextToken().charAt(0);
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			int alphaIndex = alpha - 'a';
			
			int count = prefixSum[alphaIndex][r + 1] - prefixSum[alphaIndex][l];
			sb.append(count).append("\n");
		}
		
		br.close();
		System.out.print(sb);
		
	}

}