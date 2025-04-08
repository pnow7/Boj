import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<String> set = new HashSet<>();
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j <= s.length(); j++) {
				String s1 = s.substring(i,j);
				set.add(s1);
			}
		}
		bw.write(set.size()+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
