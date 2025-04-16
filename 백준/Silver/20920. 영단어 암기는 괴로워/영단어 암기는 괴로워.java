import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			if(s.length() >= M) {
                map.put(s, map.getOrDefault(s, 0)+1);    
            }
		}
        
		List<String> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list, (o1, o2) -> {
			if(Integer.compare(map.get(o2), map.get(o1)) != 0) {
				return Integer.compare(map.get(o2), map.get(o1));
			}
			if(Integer.compare(o2.length(), o1.length()) != 0) {
				return Integer.compare(o2.length(), o1.length());
			}
			return o1.compareTo(o2);
		});

		for(String result : list) {
			bw.write(result+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}