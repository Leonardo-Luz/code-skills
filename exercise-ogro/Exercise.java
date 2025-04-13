import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int fingers = scan.nextInt();

		String finger = "|";
		if (fingers > 5) {
			System.out.println(finger.repeat(fingers - fingers % 5));
			System.out.println(finger.repeat(fingers % 5));
		} else {
			System.out.println(fingers == 0 ? "*" : finger.repeat(fingers));
			System.out.println("*");
		}

		scan.close();
	}
}
