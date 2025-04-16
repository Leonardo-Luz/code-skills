package ifrs.edu.br;

public class Point {
	public int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean outOfBound(Point size) {
		return x <= 0 || y <= 0 || x > size.x || y > size.y;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Point) && this.x == ((Point) obj).x && this.y == ((Point) obj).y;
	}

	@Override
	public String toString() {
		return "point: x: " + this.x + " y: " + this.y;
	}
}
