import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int azA = scanner.nextInt();
		scanner.nextLine();
		
		int azB = scanner.nextInt();
		scanner.nextLine();

		int a = 2;
		int b = -4 - azA;
		int c = 2 * azA + 2 * azB;

		int val = (b * b) - (4 * a * c );
		double rad = Math.sqrt(val);

		if (Double.isNaN(rad)) {
			System.out.println("-1 -1");
			scanner.close();
			return;
		}


		int x1 = ( -b + (int) rad ) / ( 2 * a );
		int x2 = ( -b - (int) rad ) / ( 2 * a );

		int alt = ( x1 > 0 ? x1 : x2 > 0 ? x2 : -1 );

		int larg;
		try {
			larg = (azB / ( alt-2 )) + 2;
		} catch (Exception e) {
			larg = -1;
			alt = -1;
		}

		System.out.println(alt > larg ? larg + " " + alt : alt + " " + larg);

		scanner.close();
	}
}
