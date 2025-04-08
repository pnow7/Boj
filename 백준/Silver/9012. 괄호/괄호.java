import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			bw.write(isValid(s));
		}
        
		br.close();
		bw.flush();
		bw.close();
	}
	public static String isValid(String s) {
		Stack<Character> stack = new Stack<>();
		int length = s.length();
		
		for(int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if(ch == '(') {
				stack.push(ch); 
			}
			else if(stack.isEmpty()) {
				return "NO\n"; 
			}
			else {
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			return "NO\n";
		}
		else {
			return "YES\n";
		}
	}

}