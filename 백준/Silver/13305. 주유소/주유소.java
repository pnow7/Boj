import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] distance = new int[N - 1];
        int[] price = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N; i++) {
            price[i] = Integer.parseInt(st1.nextToken());
        }
        
        long total = price[0] * distance[0];
        long min_price = price[0];
        
        for (int i = 1; i < N - 1; i++) {
            if (min_price > price[i]) {
                min_price = price[i];
            }
            total += min_price * distance[i];
        }
        
        System.out.println(total);
        br.close();
    }
}