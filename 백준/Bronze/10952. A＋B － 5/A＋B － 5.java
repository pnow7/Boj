import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum = A + B;
			if(sum == 0) {
				break;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
