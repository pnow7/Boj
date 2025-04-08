import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        
        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for(int j = 0; j<num.length; j++){
            if(num[j] > max){
                max = num[j];
            }
        }
        int min = num[0];
        for(int k = 0; k<num.length; k++){
            if(num[k] < min){
                min = num[k];
            }
        }
        System.out.print(min+" "+max);
    }
}