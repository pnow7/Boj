import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); 
		
		int result = 0; 
		int count = 2;
		
		while(true) {
			if(N == 1) {
				break;
			}
			
			if(N%count == 0) { 
				N = N/count;
				System.out.println(count);
				
			}
			else {
				count++;
			}

		}
		br.close();
	}

}
