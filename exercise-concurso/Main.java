import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int PARTICIPANTES = scanner.nextInt();
		final int MIN_APROVADOS = scanner.nextInt();
		scanner.nextLine();

		int[] notas = new int[PARTICIPANTES];
		for (int i = 0; i < PARTICIPANTES; i++) notas[i] = scanner.nextInt();
		scanner.nextLine();

		Arrays.sort(notas);

		for (int i = notas.length-1; i > 0; i--) {
			if (MIN_APROVADOS == notas.length - i) {
				System.out.println(notas[i]);
				scanner.close();
				return;
			}
		}

		scanner.close();
	}
}
