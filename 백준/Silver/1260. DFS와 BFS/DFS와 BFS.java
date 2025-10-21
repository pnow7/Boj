import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int M;
    
    static boolean[] visitedDfs;
    static boolean[] visitedBfs;
    static List<Integer>[] graph;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());
            
        visitedDfs = new boolean[N + 1];
        visitedBfs = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        DFS(startNode);
        System.out.println();
        
        BFS(startNode);
        
        br.close();
    }
    
    static void DFS(int nodeIndex) {
        visitedDfs[nodeIndex] = true;
        
        System.out.print(nodeIndex + " ");
        
        for (int nextNode : graph[nodeIndex]) {
            if (!visitedDfs[nextNode]) {
                DFS(nextNode);
            }
        }
    }
    
    static void BFS(int nodeIndex) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(nodeIndex);
        visitedBfs[nodeIndex] = true;
        
        while(!q.isEmpty()) {
            int currentNode = q.poll();
            
            System.out.print(currentNode + " ");
            
            for (int nextNode : graph[currentNode]) {
                if (!visitedBfs[nextNode]) {
                    visitedBfs[nextNode] = true;
                    q.offer(nextNode);
                }
            }
        }
    }
    
}