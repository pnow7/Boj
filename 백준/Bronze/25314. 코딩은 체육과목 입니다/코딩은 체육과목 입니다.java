import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = N/4;
		for(int i = 1; i <= num; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}