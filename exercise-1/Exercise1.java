import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int MAX_GAME = 6;
		int gamesWinned = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < MAX_GAME; i++) {
			if(scan.nextLine().equals("V")) gamesWinned++;
		}

		switch (gamesWinned) {
			case 5,6:
				System.out.println("1");
				break;
			case 3,4:
				System.out.println("2");
				break;
			case 1,2:
				System.out.println("3");
				break;
			default:
				System.out.println("-1");
				break;
		}
		scan.close();
	}
}
