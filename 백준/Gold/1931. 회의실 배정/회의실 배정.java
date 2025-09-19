import java.io.*;
import java.util.*;

class Meeting {
    int start;
    int end;
    
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Meeting> meetings = new ArrayList<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meetings.add(new Meeting(start, end));
        }
        
        Collections.sort(meetings, (a, b) -> {
            if (a.end == b.end) {
                return Integer.compare(a.start, b.start);
            }
            
            return Integer.compare(a.end, b.end);
        });
        
        int count = 0;
        int lastEndTime = 0;     
             
        for (Meeting m : meetings) {
            if (m.start >= lastEndTime) {
                count++;
                lastEndTime = m.end;
            }
        }
        
        System.out.println(count);
        br.close();     
    }
}