import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();

		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st1.nextToken());

			if(num1 == 1) {
				stack.push(Integer.parseInt(st1.nextToken()));
			}
			else if(num1 == 2) {
				bw.write(stack.isEmpty() ? "-1\n" : stack.pop()+"\n");
			}
			else if(num1 == 3) {
				bw.write(stack.size()+"\n");
			}
			else if(num1 == 4) {
				bw.write(stack.isEmpty() ? "1\n" : "0\n");
			}
			else {
				bw.write(stack.isEmpty() ? "-1\n" : stack.peek()+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}