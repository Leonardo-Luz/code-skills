import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int hours = scanner.nextInt();
		scanner.nextLine();

		int minutes = scanner.nextInt();
		scanner.nextLine();

		int seconds = scanner.nextInt();
		scanner.nextLine();

		int secondsAdiado = scanner.nextInt();

		seconds += secondsAdiado;
		if (seconds >= 60) {
			minutes += (seconds / 60);
			seconds = seconds % 60;
			if (minutes >= 60){
				hours += (minutes / 60);
				minutes = minutes % 60;
			}
		}

		System.out.println(hours + "\n" + minutes + "\n" + seconds);

		scanner.close();
	}
}
