import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int P = 1000000007;
        
        long fact_N = factorial(N, P);
        long inv_fact_K = pow(factorial(K, P), P - 2, P);
        long inv_fact_NK = pow(factorial(N - K, P), P - 2, P);
        
        long result = (fact_N * inv_fact_K) % P * inv_fact_NK % P;
        
        System.out.println(result);
        br.close();
    }
    
    static long factorial(int n, int p) {
        long result = 1;
        
        for (int i = 2; i <= n; i++) {
            result = (result * i) % p;
        }
        
        return result;
    }
    
    static long pow(long base, long exponent, long p) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base % p;
        
        long temp = pow(base, exponent / 2, p);
        
        if (exponent % 2 == 0) {
            return (temp * temp) % p;
        } else {
            return ((temp * temp % p) * (base % p)) % p;
        }
    }
    
}