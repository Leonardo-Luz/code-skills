import java.util.Scanner;

/**
 Plano de Internet
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int NETWORK_QUOTA = scanner.nextInt();
		scanner.nextLine();

		final int MONTHS_QTY = scanner.nextInt();
		scanner.nextLine();

		int quota = NETWORK_QUOTA;
		for (int i = 0; i < MONTHS_QTY; i++) {
			quota += NETWORK_QUOTA;
			quota -= scanner.nextInt() ;
			scanner.nextLine();
		}

		System.out.println(quota);

		scanner.close();
	}
}
