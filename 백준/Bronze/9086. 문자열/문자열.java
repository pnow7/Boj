import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		String[] st = new String[t];
		
		for(int i = 1; i <= t; i++) {
			st[i-1] = br.readLine();
		}
		
		for(int j = 1; j <= t; j++) {
			bw.write(st[j-1].charAt(0));
			bw.write(st[j-1].charAt(st[j-1].length()-1)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
