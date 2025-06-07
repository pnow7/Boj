import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(tile(N)));
        
        br.close();
        bw.flush();
        bw.close();
    }
    
    public static int tile(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        int a = 1;
        int b = 2;
        int result = 0;
        
        for(int i = 3; i <= n; i++) {
            result = (a + b) % 15746;
            a = b;
            b = result;
        }
        
        return result;
    }
}