import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] man = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			man[i] = Integer.parseInt(st.nextToken());
		}
		bw.write(isValid(man)+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static String isValid(int[] num) {
		Stack<Integer> stack = new Stack<>();
		
		int order = 1;
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] == order) {
				order++;
			}
			else {
				stack.push(num[i]);
			}

			while(!stack.isEmpty() && stack.peek() == order) {
				stack.pop();
				order++;
			}
		}
		
		return stack.isEmpty() ? "Nice" : "Sad";
	}

}
