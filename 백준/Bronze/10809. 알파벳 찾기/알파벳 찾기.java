import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main { 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] en = new int[26];
		
		for(int i = 0; i < en.length; i++) {
			en[i] = -1; 
		}
		
		String st = br.readLine();
		
		for(int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i); 

			if(en[ch-'a'] == -1) {
				en[ch-'a'] = i;
			}
		}
		
		for(int val : en) {
			System.out.print(val + " ");
		}
	}

}
