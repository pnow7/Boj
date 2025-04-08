import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alp = new int[26]; 
		String s = br.readLine(); 
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) { 
				alp[s.charAt(i)-65]++; 
			}
			else {
				alp[s.charAt(i)-97]++; 
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < alp.length; i++) {
			if(alp[i] > max) {
				max = alp[i];
				ch = (char)(i + 65); 
			}
			else if(alp[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
		br.close();
	}
}
