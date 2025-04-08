import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new LinkedList<>(); 
		
		int N = Integer.parseInt(br.readLine());
		int[] type = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());;
		for(int i = 0; i < N; i++) {
			type[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(type[i] == 0) {
				q.addFirst(num);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int inputNum = Integer.parseInt(st.nextToken());
			q.addLast(inputNum);
			sb.append(q.pollFirst()).append(" ");
		}
		
		bw.write(sb.toString().trim());
		br.close();
		bw.flush();
		bw.close();
	}

}
