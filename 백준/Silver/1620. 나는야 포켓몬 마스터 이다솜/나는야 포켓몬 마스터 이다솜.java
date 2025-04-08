import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		Map<String, Integer> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			String name = br.readLine();
			map1.put(name, i);
			map2.put(i, name);
		}
	
		for(int i = 0; i < M; i++) {
			String result = br.readLine();
 
			if(49 <= result.charAt(0) && result.charAt(0) <= 57) {
				sb.append(map2.get(Integer.parseInt(result)));
			}
			else {
				sb.append(map1.get(result));
			}
			sb.append("\n");
		}
		bw.write(sb + " ");
		
		br.close();
		bw.flush();
		bw.close();
    
    }
}