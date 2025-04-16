package ifrs.edu.br;

public class Stone extends Point {
	private boolean percorred;

	public Stone(int x, int y) {
		super(x, y);

		this.percorred = false;
	}

	public void setPercorred(boolean percorred) {
		this.percorred = percorred;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && !percorred;
	}

	@Override
	public String toString() {
		return super.toString() + " percorred: " + this.percorred;
	}
}
