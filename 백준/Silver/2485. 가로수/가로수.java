import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		
		int diff;
		int gcd = 0;
		for(int i = 0 ; i < N-1; i++) {
			diff = list.get(i+1) - list.get(i);
			gcd = gcd(diff,gcd);
		}
		
		bw.write((list.get(N-1)-list.get(0))/gcd + 1 - list.size()+"");
		br.close();
		bw.flush();
		bw.close();
	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}
