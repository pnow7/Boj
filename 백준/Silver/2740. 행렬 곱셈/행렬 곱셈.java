import java.io.*;
import java.util.*;

public class Main {
    
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N1 = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        
        int[][] arr1 = new int[N1][M1];
        for (int i = 0; i < N1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M1; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        st = new StringTokenizer(br.readLine());
        int M2 = Integer.parseInt(st.nextToken());
        int K2 = Integer.parseInt(st.nextToken());
        
        int[][] arr2 = new int[M2][K2];
        for (int i = 0; i < M2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K2; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        multiply(arr1, arr2);
        System.out.print(sb);
        br.close();
    }
    
    static void multiply(int[][] A, int[][] B) {
        int A_row = A.length;           
        int A_col = A[0].length;        
        int B_col = B[0].length;           
        int[][] result = new int[A_row][B_col];
        
        for (int i = 0; i < A_row; i++) {
            for (int j = 0; j < B_col; j++) {
                for (int k = 0; k < A_col; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
    }
    
}