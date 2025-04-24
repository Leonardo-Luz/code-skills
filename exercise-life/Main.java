import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean outOfBounds(int i, int j, int size){
		return i < 0 || i >= size || j < 0 || j >= size;
	}

	static boolean check(char cell, int i, int j, int size, String[] array) {
		int count = 0;
		if (!outOfBounds(i+1, j, size)   && array[i+1].charAt(j) == '1') count++;
		if (!outOfBounds(i-1, j, size)   && array[i-1].charAt(j) == '1') count++;
		if (!outOfBounds(i, j+1, size)   && array[i].charAt(j+1) == '1') count++;
		if (!outOfBounds(i, j-1, size)   && array[i].charAt(j-1) == '1') count++;
		if (!outOfBounds(i+1, j+1, size) && array[i+1].charAt(j+1) == '1') count++;
		if (!outOfBounds(i-1, j-1, size) && array[i-1].charAt(j-1) == '1') count++;
		if (!outOfBounds(i+1, j-1, size) && array[i+1].charAt(j-1) == '1') count++;
		if (!outOfBounds(i-1, j+1, size) && array[i-1].charAt(j+1) == '1') count++;

		switch (cell) {
			case '0':
				return count == 3;
			case '1':
				return !(count < 2 || count > 3);
		}

		return false;
	}



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		int steps  = scanner.nextInt();
		scanner.nextLine();

		String[] array = new String[size];

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextLine();
		}

		for (int x = 0; x < steps; x++) {
			String[] parsed = new String[size];
			for (int i = 0; i < size; i++) {
				char[] chars = array[i].toCharArray();
				parsed[i] = "";
				for (int j = 0; j < size; j++) {
					parsed[i] += check(chars[j], i, j, size, array) ? '1' : '0';
				}
			}
			for (int i = 0; i < parsed.length; i++) {
				array[i] = parsed[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
		scanner.close();
	}
}
