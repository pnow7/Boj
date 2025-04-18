import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        
		System.out.println(fibonacci(n));
		br.close();
	}
	
	public static int fibonacci(int num) {
		if(num == 0) return 0;
		if(num == 1) return 1;
		
		return fibonacci(num-1) + fibonacci(num-2);
	}

}