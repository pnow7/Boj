import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String s = br.readLine();
			if(s.equals(".")) {
				break;
			}
			bw.write(isValid(s)+"\n");
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
			if(ch == '(' || ch == '[') {
				stack.push(ch); 
			}
			else if(ch == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			else if(ch == ']') {
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
		}	
		if(stack.isEmpty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}

}