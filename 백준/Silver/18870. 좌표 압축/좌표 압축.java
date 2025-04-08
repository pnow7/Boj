import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] number = new int[N];
		int[] chk = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			number[i] = chk[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(chk);

		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(chk[i])) {
				map.put(chk[i], idx++);
			}
		}
		
		for(int i = 0; i < N; i++) {
			bw.write(map.get(number[i]) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
