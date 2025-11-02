import java.io.*;
import java.util.*;

public class Main {
    
    static Comparator<Integer> comparator = (a, b) -> {
        if (Math.abs(a) != Math.abs(b)) {
            return Math.abs(a) - Math.abs(b);
        } else {
            return a - b;
        }
    };
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> heap = new PriorityQueue<>(comparator);
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num != 0) {
                heap.add(num);
            } else {
                if (heap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(heap.poll()).append("\n");
                }
            }
        }
        
        System.out.println(sb.toString());
        br.close();
    }
    
}