import java.io.*;
import java.util.*;
		
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		Deque<Integer> q1 = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j < K; j++) {
				q.offer(q.peek());
				q.removeFirst();
			}
			q1.offer(q.poll());
		}
        
		StringBuilder sb = new StringBuilder("<");
		for(Integer result : q1) {
			sb.append(result).append(", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append(">");
		
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}

}