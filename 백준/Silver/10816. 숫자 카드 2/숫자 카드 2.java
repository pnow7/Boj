import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			sb.append(upperBound(num, target) - lowerBound(num, target)).append(' ');
		}
		bw.write(sb+" ");
		br.close();
		bw.flush();
		bw.close();
			
	}
	public static int lowerBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo+hi)/2;
			
			if(key <= arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	public static int upperBound(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo+hi)/2;
			
			if(key < arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}

