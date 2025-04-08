import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        int h1, m1, m2;
     
        m1 = m + time;
        
        if(m1 < 60){
            System.out.print(h+" "+m1);
        }
        else{ 
            m2 = m1%60; 
            h1 = h+(m1/60); 
            if(h1 >= 24){
                h1 = h1 - 24;
            }
            System.out.print(h1+" "+m2);
        }
    }
}