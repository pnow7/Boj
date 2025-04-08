import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		

		Arrays.sort(str, (s1,s2) ->{
			if(s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}
			else {
				return s1.length()-s2.length();
			}
		});

	
		bw.write(str[0]+"\n");
		
		for(int i = 1; i < N; i++) {
			if(!str[i].equals(str[i-1])) {
				bw.write(str[i] + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}