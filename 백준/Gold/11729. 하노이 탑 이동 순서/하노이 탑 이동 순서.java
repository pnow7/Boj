import java.io.*;
public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, N) -1)).append("\n");
		Honoi(N, 1, 2, 3);
		System.out.println(sb);

	}
	static void Honoi(int N, int start, int mid, int end) {
		if(N == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		Honoi(N-1, start, end, mid);
		sb.append(start + " " + end + "\n");
		Honoi(N-1, mid, start, end);
	}
}