import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int MAX_SISTERS = 3;
		List<Integer> sisters = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < MAX_SISTERS; i++) {
			sisters.add(scanner.nextInt());
			scanner.nextLine();
		}

		Collections.sort(sisters);
		System.out.println(sisters.get(MAX_SISTERS/2));

		scanner.close();
	}
}
