import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num == 0) {
                if (maxHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(maxHeap.poll()).append("\n");
                }
            } else {
                maxHeap.add(num);
            }
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}