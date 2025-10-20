import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> LISList = new ArrayList<>();
        
        LISList.add(Integer.parseInt(st.nextToken()));
        
        for (int i = 1; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            int lastValue = LISList.get(LISList.size() - 1);
            
            if (value > lastValue) {
                LISList.add(value);
            } else {
                int index = binarySearch(LISList, value);
                LISList.set(index, value);
            }
        }
        
        System.out.println(LISList.size());
        br.close();
    }
    
    static int binarySearch(List<Integer> list, int target) {
        int lo = 0;
        int hi = list.size();
        
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            
            if (list.get(mid) >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        return lo;
    }
}