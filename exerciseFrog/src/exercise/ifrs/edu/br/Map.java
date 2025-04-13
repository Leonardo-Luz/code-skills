package ifrs.edu.br;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
	private Point size; // useless
	private List<Stone> stones;
	private Point frog;
	private Point end;
	public boolean exited;

	public Map(Point size) {
		this.size = size;
		this.stones = new ArrayList<>();
		this.frog = null;
		this.end = null;
	}

	public void setup(Scanner scan) {
		int stonesQty = scan.nextInt();
		scan.nextLine(); // Consume

		for (int i = 0; i < stonesQty; i++) {
			Stone stonePos = new Stone(scan.nextInt(), scan.nextInt());
			scan.nextLine(); // Consume
			this.stones.add(stonePos);
		}

		Point frogPos = new Point(scan.nextInt(), scan.nextInt());
		scan.nextLine(); // Consume
		this.frog = frogPos;

		Point endPos = new Point(scan.nextInt(), scan.nextInt());
		scan.nextLine(); // Consume
		this.end = endPos;
	}

	public void exit(Point currentPos) {
		int JUMP_FORCE = 3;

		if (currentPos == null) {
			currentPos = this.frog;
		}

		if (exited || this.frog.equals(this.end)) {
			exited = true;
			return;
		}

		if (stones.contains(this.frog)) {
			for (Stone stone : stones) {
				if (stone.equals(this.frog)) {
					stone.setPercorred(true);
					break;
				}
			}
		}

		Point up = new Point(currentPos.x, currentPos.y - JUMP_FORCE);
		Point right = new Point(currentPos.x + JUMP_FORCE, currentPos.y);
		Point down = new Point(currentPos.x, currentPos.y + JUMP_FORCE);
		Point left = new Point(currentPos.x - JUMP_FORCE, currentPos.y);
		List<Point> valid = new ArrayList<>();

		valid.add(up);
		valid.add(right);
		valid.add(down);
		valid.add(left);

		for (Point point : valid) {
			for (int i = 0; i < JUMP_FORCE; i++) {
				if (point.equals(this.end)) {
					exited = true;
					return;
				}

				for (Stone stone : stones) {
					if (stone.equals(point)) {
						stone.setPercorred(true);
						exit(point);
						break;
					}
				}

				point.x = point.x == currentPos.x
						? point.x
						: point.x + (point.x > currentPos.x ? -1 : 1);

				point.y = point.y == currentPos.y
						? point.y
						: point.y + (point.y > currentPos.y ? -1 : 1);
			}
		}
	}
}
