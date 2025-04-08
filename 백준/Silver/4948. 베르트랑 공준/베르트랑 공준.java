import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		while((s = br.readLine()) != null) {
			int num = Integer.parseInt(s);
			if(num == 0) {
				break;
			}
			
			int count = 0;
			for(int i = num+1; i <= 2*num; i++) {
				if(isPrime(i)) {
					count++;
				}
			}
	
			sb.append(count).append("\n");
		}
		bw.write(sb.toString());
        
		br.close();
		bw.flush();
		bw.close();
	}
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
        
		return true;
	}

}
