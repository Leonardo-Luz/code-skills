import java.util.Scanner;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int altura = scanner.nextInt();
		scanner.nextLine();

		int distSobe = scanner.nextInt();
		scanner.nextLine();

		int distDesce = scanner.nextInt();
		scanner.nextLine();


		int count = 0;
		while (altura > 0) {
			count++;
			if (altura <= distSobe) {
				break;
			}
			altura -= (distSobe - distDesce);
		}

		System.out.println(count);

		scanner.close();
	}
}
