import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for(int i = 1; i <= N; i++) {
			int sum = i;
			
			String str = String.valueOf(i);
			
			for(int j = 0; j < str.length(); j++) {
				sum += str.charAt(j) - '0';
			}
			
			if(sum == N) {
				System.out.println(i);
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(0);
		}
		
		br.close();
	}


}
