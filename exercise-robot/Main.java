import java.util.Scanner;

/**
 Robô
 */
public class Main {

	public static void main(String[] args) {
		int currentPos = 1;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		final int STATIONS_QTY = scanner.nextInt();
		final int COMMANDS_QTY = scanner.nextInt();
		final int TARGET       = scanner.nextInt();
		scanner.nextLine();

		if(currentPos == TARGET){
			count++;
		}
		for (int i = 0; i < COMMANDS_QTY; i++) {
			int direc = scanner.nextInt();
			currentPos =  currentPos + direc < 1 ? STATIONS_QTY : currentPos + direc > STATIONS_QTY ? 1 : currentPos + direc;

			if(currentPos == TARGET){
				count++;
			}
		}

		System.out.println(count);

		scanner.close();
	}
}
