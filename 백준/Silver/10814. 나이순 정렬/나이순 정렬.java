import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] name = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			name[i][0] = st.nextToken(); 
			name[i][1] = st.nextToken(); 
		}
		
		Arrays.sort(name, (e1, e2) -> {
				return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
		});
		
		
		for(int i = 0; i < N; i++) {
			bw.write(name[i][0] + " " + name[i][1] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}