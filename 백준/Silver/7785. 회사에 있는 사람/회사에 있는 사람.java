import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		Map<String, String> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			
			if(map.containsKey(name)) {
				map.remove(name);
			}
			else {
				map.put(name, log);
			}
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(String key : list) {
			bw.write(key+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
