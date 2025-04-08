import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        
        StringTokenizer words = new StringTokenizer(word, " ");
        
        System.out.println(words.countTokens());
    }
}