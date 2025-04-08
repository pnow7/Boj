import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] a = new int[chess.length];
		int[] result = new int[chess.length];
		for(int i = 0; i < chess.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			result[i] = chess[i] - a[i];
		}
		for(int j = 0; j < chess.length; j++) {
			System.out.print(result[j]+" ");
		}
		br.close();

	}

}
