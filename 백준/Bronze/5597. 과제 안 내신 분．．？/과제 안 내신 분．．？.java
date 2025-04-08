import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] student = new int[30];
		
		for(int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine());
			student[num-1] = 1;   
		}
		for(int j = 0; j < 30; j++) {  
			if(student[j] == 0) { 
				bw.write((j+1)+"\n");
			} 
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
