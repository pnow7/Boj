import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Long> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		Long[] num = new Long[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = Long.parseLong(br.readLine());

			if(num[i] < 2) {
				list.add((long)2);
			}
			else {
				for(Long j = num[i]; j < num[i]*2; j++) {
					if(isPrime(j)) {
						list.add(j);
						break;
					}
				}
			}
		}
	
		for(Long k : list) {
			bw.write(k+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	public static boolean isPrime(Long num) {
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
