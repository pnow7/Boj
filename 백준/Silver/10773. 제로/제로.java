import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		
		int count = 0;
		int length = stack.size();
		for(int i = 0; i < length; i++) {
			count += stack.pop();
		}	
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
