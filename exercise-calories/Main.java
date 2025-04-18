import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int e1 = scanner.nextInt();
		scanner.nextLine();

		int e2 = scanner.nextInt();
		scanner.nextLine();

		int e3 = scanner.nextInt();
		scanner.nextLine();

		int x = scanner.nextInt();
		scanner.nextLine();

		System.out.println(Math.abs(e1 - e2) <= x ? e2 : e3);

		scanner.close();
	}
}
