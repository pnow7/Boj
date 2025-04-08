import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		StringBuilder result = new StringBuilder();
		
		while(n > 0) {
			int remain = n % num;
			char ch;
		
			if(remain >= 10) {
				ch = (char)(remain - 10 + 'A');
			}
			else {
				ch = (char)(remain + '0');
			}
			
			result.append(ch);
			n = n/num;
		}
		
		System.out.print(result.reverse());
	}

}