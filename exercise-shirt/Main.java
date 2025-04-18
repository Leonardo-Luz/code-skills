import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// premiados
	// tamanhos indicados das camisas pelos premiados (1=pequeno, 2=medio)
	// numero camisas pequeno
	// numero camisas medio
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> shirts = new ArrayList<>();

		int premiados = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < premiados; i++) {
			shirts.add(scanner.nextInt());
		}
		scanner.nextLine();

		int small = scanner.nextInt();
		scanner.nextLine();
		int medium = scanner.nextInt();
		scanner.nextLine();

		for (Integer size : shirts) {
			switch (size) {
				case 1:
					small--;
					break;
				case 2:
					medium--;
					break;
			}
		}

		System.out.println(small >= 0 && medium >= 0 ? "S" : "N");

		scanner.close();
	}
}
