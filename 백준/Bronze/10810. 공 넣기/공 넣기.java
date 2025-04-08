import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
import java.io.IOException;
import java.util.StringTokenizer;
public class Main { 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 

		int N = Integer.parseInt(st.nextToken());  
		int[] basket = new int[N];
		int M = Integer.parseInt(st.nextToken()); 
		
		for(int test_case = 0; test_case < M; test_case++) {
			st = new StringTokenizer(br.readLine()); 
			
			int i = Integer.parseInt(st.nextToken()); 
			int j = Integer.parseInt(st.nextToken()); 
			int k = Integer.parseInt(st.nextToken()); 
			
			for(int test_case1 = i; test_case1 <= j; test_case1++) {
				basket[test_case1-1] = k; 
			}
		} 
		for(int test_case2 = 0; test_case2 < N; test_case2++) {
			bw.write(basket[test_case2]+" "); 
		}
		br.close();
		bw.flush();
		bw.close();	
	}
}
