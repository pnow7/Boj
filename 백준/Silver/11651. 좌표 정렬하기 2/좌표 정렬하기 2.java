import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] number = new int[N][2];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			number[i][0] = Integer.parseInt(st.nextToken());
			number[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(number, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0]; 
			}
			else {
				return e1[1] - e2[1]; 
			}

		});

		for(int i = 0; i < N; i++) {
			bw.write(number[i][0]+ " " + number[i][1] + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
