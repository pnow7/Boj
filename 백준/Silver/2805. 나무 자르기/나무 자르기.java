import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        System.out.println(binarySearch(arr, M));
        br.close();
    }
    
    static int binarySearch(int[] arr, int M) {
        int lo = 0;
        int hi = Math.max(arr[arr.length - 1], 0);
        int maxHeight = 0;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            long treeSum = 0;
            for (int tree : arr) {
                treeSum += Math.max((long) tree - mid, 0);
            }
            
            if (treeSum >= M) {
                maxHeight = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        return maxHeight;
    }
    
}