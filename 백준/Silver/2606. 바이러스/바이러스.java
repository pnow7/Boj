import java.io.*;
import java.util.*;

public class Main {
    
    static int N, M;
    static boolean[] visited;
    static List<Integer>[] coms;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        int start = 1;
        visited = new boolean[N + 1];
        coms = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            coms[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            coms[x].add(y);
            coms[y].add(x);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(coms[i]);
        }

        DFS(start);
        
        System.out.println(count - 1);
        br.close();
    }

    static void DFS(int start) {
        visited[start] = true;
        count++;

        for (int next : coms[start]) {
            if (!visited[next]) {
                DFS(next);
            }
        }
    }

}