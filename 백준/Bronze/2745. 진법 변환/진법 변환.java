import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken(); //값
		int num = Integer.parseInt(st.nextToken()); //진수값
		int total = 0;
		
		for(int i = 0; i < n.length(); i++) { //0~5 01234  
			char ch = n.charAt(i);
			int result;
			
			//대문자가 있으면 0 = 48 
			if(ch >= 'A' && ch <= 'Z') {
				result = ch-'A'+10;  // A이면 result = 10
			}
			else { //숫자라면
				result = ch-'0';
			}
			total += result*Math.pow(num, n.length()-(i+1));
		}
		
		System.out.print(total);

	}

}