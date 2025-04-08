import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> set = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		set.add("ChongChong");
        
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name1 = st.nextToken();
			String name2 = st.nextToken();
			if(name1.equals("ChongChong") || name2.equals("ChongChong")) {
				set.add(name1);
				set.add(name2);
			}
			else {
				if(set.contains(name1) || set.contains(name2)) {
					set.add(name1);
					set.add(name2);
				}
			}
		}
		bw.write(set.size()+"");
		br.close();
		bw.flush();
		bw.close();

	}

}