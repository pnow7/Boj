import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> q = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
	
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		while(q.size() != 1) {
			q.removeFirst();
			
			int card;
			card = q.poll();
			q.offer(card);
		}
        
		bw.write(q.peek()+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}