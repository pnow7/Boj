import java.io.*;
public class Main {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			sb.append(isPalindrome(s)+" "+count+"\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	public static int recursion(String s, int l, int r) {
		count++;
		if(l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static int isPalindrome(String s) {
		count = 0;
		return recursion(s, 0, s.length()-1);
	}
	
	
}