import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int charLen = scan.nextInt();
		scan.nextLine();

		String word1 = scan.nextLine();
		String word2 = scan.nextLine();

		if (word1.length() != charLen || word2.length() != charLen) {
			System.out.println("N");
		}

		int words1Hash = 1;
		int words2Hash = 1;
		for (int i = 0; i < charLen; i++) {
			char char1 = word1.charAt(i);
			char char2 = word2.charAt(i);
			if (char1 != '.' && char1 != ',' && char1 != ' ')
				words1Hash *= (int) char1;
			if (char2 != '.' && char2 != ',' && char2 != ' ')
				words2Hash *= (int) char2;
		}

		if (words1Hash == words2Hash) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

		scan.close();
	}
}
