import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int fCRepouso = scanner.nextInt();
		scanner.nextLine();

		int fCAtual = scanner.nextInt();
		scanner.nextLine();

		int oxigenio = scanner.nextInt();
		scanner.nextLine();

		System.out.println(fCAtual > fCRepouso * 3 && oxigenio < 95 ? "diminuir" : fCAtual < fCRepouso * 2 && oxigenio > 97 ? "aumentar" : "manter");

		scanner.close();
	}
}
