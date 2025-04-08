import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		int[] num1 = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			num1[i] = Integer.parseInt(st.nextToken());
			map.put(num1[i], i);
		}

		int M = Integer.parseInt(br.readLine());
		int[] num2 = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			num2[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			int result = 0;
			if(map.containsKey(num2[i])) {
				result += 1;
			}
			else {
				result += 0;
			}
			bw.write(result + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
				
	}
	
}
