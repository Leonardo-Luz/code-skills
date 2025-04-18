import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int coins = scanner.nextInt();
		scanner.nextLine();
		int sailors = scanner.nextInt();

		int each = (coins / (sailors + 2));
		int totalSailors = each * sailors;
		System.out.println(coins - totalSailors);

		scanner.close();
	}
}
