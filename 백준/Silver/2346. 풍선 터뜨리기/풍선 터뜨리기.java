import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> indexDeque = new ArrayDeque<>(); 
        Deque<Integer> moveDeque = new ArrayDeque<>();  
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            indexDeque.addLast(i); 
            moveDeque.addLast(Integer.parseInt(st.nextToken())); 
        }
        StringBuilder sb = new StringBuilder();

        while (!indexDeque.isEmpty()) {
            int index = indexDeque.pollFirst();
            int move = moveDeque.pollFirst(); 
            
            sb.append(index).append(" "); 
            
            if (indexDeque.isEmpty()) break; 
            
            if (move > 0) { 
                for (int i = 0; i < move - 1; i++) { 
                    indexDeque.addLast(indexDeque.pollFirst());
                    moveDeque.addLast(moveDeque.pollFirst());
                }
            } else { 
                for (int i = 0; i < Math.abs(move); i++) {
                    indexDeque.addFirst(indexDeque.pollLast());
                    moveDeque.addFirst(moveDeque.pollLast());
                }
            }
        }
        bw.write(sb.toString().trim());
        br.close();
        bw.flush();
        bw.close();
    }
}