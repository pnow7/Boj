import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int line = 0;
		int sum = 0;
		
		while(sum < n) {  
			line++;
			sum += line; 
		}
		
		int indexLine = n - (sum - line);
		
		int son, mom;
		
		if(line % 2 == 0) {
			son = indexLine;
			mom = line - indexLine + 1;
		}
		else {
			son = line - indexLine+1;
			mom = indexLine;
		}
		
		System.out.println(son + "/" + mom);
		br.close();
	}
}