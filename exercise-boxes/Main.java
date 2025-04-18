import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int boxA = scanner.nextInt();
		scanner.nextLine();

		int boxB = scanner.nextInt();
		scanner.nextLine();

		int boxC = scanner.nextInt();
		scanner.nextLine();

		int viagens = 3;

		if (( boxC - (boxB + boxA) ) > 0) viagens = 1;
		else if (boxC - (boxB - boxA) > 0) viagens = 1;
		else if((boxC - (boxC) > 0)) viagens = 2;
		else if((boxC - (boxA) > 0)) viagens = 2;
		else viagens = 3;

		System.out.println(viagens);

		scanner.close();
	}
}
