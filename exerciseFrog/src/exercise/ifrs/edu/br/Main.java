package ifrs.edu.br;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Point mapSize = new Point(scan.nextInt(), scan.nextInt());
		scan.nextLine(); // Consume

		Map map = new Map(mapSize);
		map.setup(scan);

		map.exit(null);

		System.out.println(map.exited ? "S" : "N");

		scan.close();
	}
}
