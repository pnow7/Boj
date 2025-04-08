import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); 
		String Snum = sc.next(); 
		char[] Cnum = Snum.toCharArray(); 
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum = sum + Cnum[i]-48; 
		}
		System.out.println(sum);
	}
}
