import java.io.*;
public class Main {
	
	static int N;
	static int count = 0;
	static int[] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		board = new int[N];
		
		solve(0);
		
		System.out.println(count);
	}
	
	public static void solve(int row) {
		if(row == N) {
			count++;
			return;
		}
		
		for(int col = 0; col < N; col++) {
			board[row] = col;
			if(isValid(row)) {
				solve(row + 1);
			}
		}
	}
	
	public static boolean isValid(int row) {
		for(int i = 0; i < row; i++) {
			if(board[i] == board[row] || Math.abs(row - i) == Math.abs(board[row] - board[i])) {
				return false;
			}
		}
		return true;
	}
}