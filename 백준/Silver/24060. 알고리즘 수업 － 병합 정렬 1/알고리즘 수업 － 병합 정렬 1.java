import java.io.*;
import java.util.*;

public class Main {
	int A[];
	static int[] tmp;
	static int result = -1;
	static int count;
	static int K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		tmp = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(A, 0, N-1);
		System.out.println(result);
		
	}

	public static void merge_sort(int[] A, int p, int r) {
		if(count > K) return;
		if(p < r) {
			int q = (p+r)/2;
			merge_sort(A, p, q);
			merge_sort(A, q + 1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t++] = A[i++];

			}
			else {
				tmp[t++] = A[j++];
			}
		}
		while(i <= q) {
			tmp[t++] = A[i++];
		}
		while(j <= r) {
			tmp[t++] = A[j++];
		}

		t = 0;
		i = p;
		
		while(i <= r) {
			count++;
			if(count == K) {
				result = tmp[t];
			}
			
			A[i++] = tmp[t++];
		}
	}
	
}