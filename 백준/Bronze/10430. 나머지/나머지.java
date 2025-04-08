import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        result1 = (A+B)%C;
        result2 = ((A%C)+(B%C))%C;
        result3 = (A*B)%C;
        result4 = ((A%C)*(B%C))%C;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}