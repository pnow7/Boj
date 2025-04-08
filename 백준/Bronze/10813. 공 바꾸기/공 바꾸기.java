import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[] basket = new int[N];
		int M = Integer.parseInt(st.nextToken());
		
		for(int test_case = 0; test_case < N; test_case++) {
			basket[test_case] = test_case+1;   
		}
		for(int test_case1 = 1; test_case1 <= M; test_case1++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int X = basket[i-1];
			basket[i-1] = basket[j-1]; 
			basket[j-1] = X; 
		}
		for(int test_case = 0; test_case < N; test_case++) {
			bw.write(basket[test_case]+" ");   
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
