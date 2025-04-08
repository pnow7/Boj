import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> set = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			if(s.equals("ENTER")) {
				count += set.size();
				set.clear();
			}
			else {
				set.add(s);
			}
		}
		count += set.size();
		bw.write(count+"");
		br.close();
		bw.flush();
		bw.close();

	}

}