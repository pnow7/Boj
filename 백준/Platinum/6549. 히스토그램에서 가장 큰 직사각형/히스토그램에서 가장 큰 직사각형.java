import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int n = Integer.parseInt(st.nextToken());
            
            if (n == 0) break;
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            sb.append(findMaxArea(arr, 0, n - 1)).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    
    static long findMaxArea(int[] heights, int start, int end) {
        if (start == end) return (long) heights[start];
        
        int mid = (start + end) / 2;
        int left = mid;
        int right = mid + 1;
        
        long leftArea = findMaxArea(heights, start, mid);
        long rightArea = findMaxArea(heights, mid + 1, end);
        long h = Math.min(heights[left], heights[right]);
        
        long centerArea = 0;
        centerArea = Math.max(leftArea, rightArea);
        centerArea = Math.max(centerArea, h * 2);
        
        while (start < left || right < end) {
            if (right == end || (start < left && heights[left - 1] >= heights[right + 1])) {
                left--;
                h = Math.min(h, heights[left]);
            } else {
                right++;
                h = Math.min(h, heights[right]);
            }
            
            centerArea = Math.max(centerArea, h * (right - left + 1));
        }
        
        return Math.max(centerArea, Math.max(leftArea, rightArea));
    }
    
}