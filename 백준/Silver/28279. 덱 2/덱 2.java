import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> q = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				q.addFirst(Integer.parseInt(st.nextToken()));
			}
			else if(num == 2) {
				 q.addLast(Integer.parseInt(st.nextToken()));
			}
			else if(num == 3) {
				bw.write(q.isEmpty() ? "-1\n" : q.pollFirst()+"\n");
			}
			else if(num == 4) {
				bw.write(q.isEmpty() ? "-1\n" : q.pollLast()+"\n");
			}
			else if(num == 5) {
				bw.write(q.size()+"\n");
			}
			else if(num == 6) {
				bw.write(q.isEmpty() ? "1\n" : "0\n");
			}
			else if(num == 7) {
				bw.write(q.isEmpty() ? "-1\n" : q.peekFirst()+"\n");
			}
			else {
				bw.write(q.isEmpty() ? "-1\n" : q.peekLast()+"\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}