import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main { 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken()); 
			String st1 = st.nextToken();
			
			for(int j = 0; j <st1.length(); j++) {
				char ch = st1.charAt(j); 
				for(int k = 1; k <= R; k++) {
					System.out.print(ch);
				}
			}
			System.out.println("");
		}
		br.close();

	}

}
