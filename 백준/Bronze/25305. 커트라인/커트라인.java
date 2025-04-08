import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> num = new ArrayList<>();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int number = Integer.parseInt(st1.nextToken());
			num.add(number);
		}
		
		Collections.sort(num, Collections.reverseOrder());
		
		System.out.println(num.get(K-1));
		br.close();
	}

}