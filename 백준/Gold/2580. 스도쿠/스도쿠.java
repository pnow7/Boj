import java.io.*;
import java.util.*;

public class Main {

	static int[][] board = new int[9][9];
	static ArrayList<int[]> blanks = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				
				if(board[i][j] == 0) {
					blanks.add(new int[] {i, j});
				}
			}
		}
		br.close();
		solve(0);
	}
	
	public static void solve(int idx) {
		if(idx == blanks.size()) {
			printBoard();
			System.exit(0); 
		}
		
		int[] pos = blanks.get(idx);
		int x = pos[0];
		int y = pos[1];
		
		for(int num = 1; num <= 9; num++) {
			if(isValid(x, y, num)) {
				board[x][y] = num;
				solve(idx + 1);
				board[x][y] = 0;
			}
		}
	}
	
	public static boolean isValid(int x, int y, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][y] == num) return false;
        }

        int boxX = (x / 3) * 3;
        int boxY = (y / 3) * 3;
        for (int i = boxX; i < boxX + 3; i++) {
            for (int j = boxY; j < boxY + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
	}
	
    public static void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}