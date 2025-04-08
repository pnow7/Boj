import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for(int i = 2; i * i < num.length; i++){
            if(!num[i]){
                 for(int j = i+i; j < num.length; j += i){
                     num[j] = true;
                 }
            }
        }
        
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            int number = Integer.parseInt(br.readLine());
            int count = 0;
            for(int i = 2; i <= number/2; i++){
                if(!num[i] && !num[number-i]){
                    count++;
                } 
            }
            bw.write(count+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}