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
		int M = Integer.parseInt(st.nextToken());

		int[] basket = new int[N];
		int x = 0;

		for(int num = 0; num < N; num++) {
			basket[num] = num+1;
		}

		for(int test_case = 0; test_case < M; test_case++) {
			st = new StringTokenizer(br.readLine()); //
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			while(i<j) {  
				x = basket[i-1];
				basket[i-1] = basket[j-1];
				basket[j-1] = x;
				i++;
				j--;
			}	
		}
		
		for(int test_case1 = 0; test_case1 < N; test_case1++) {
			bw.write(basket[test_case1]+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
