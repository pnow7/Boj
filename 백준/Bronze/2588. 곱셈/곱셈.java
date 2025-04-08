import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int A,B,C;
        A = num2%10;
        C = num2/100;
        B = (num2-(C*100))/10;
        System.out.println(num1*A);
        System.out.println(num1*B);
        System.out.println(num1*C);
        System.out.println((num1*A)+(num1*B*10)+(num1*C*100));
    }
}