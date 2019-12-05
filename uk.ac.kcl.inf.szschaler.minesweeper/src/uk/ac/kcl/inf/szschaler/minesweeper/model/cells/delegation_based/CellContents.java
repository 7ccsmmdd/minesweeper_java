package uk.ac.kcl.inf.szschaler.minesweeper.model.cells.delegation_based;

/**
 * Contents of a cell.
 * 
 * @author Steffen Zschaler
 */
public enum CellContents {

	ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), 
	EIGHT(8), MINE;

	private int numMines;

	private CellContents() {
		numMines = -1;
	}

	private CellContents(int numMines) {
		this.numMines = numMines;
	}

	public String getLabelText() {
		switch (numMines) {
		case -1:
			return "M";
		case 0:
			return "";
		default:
			return "" + numMines;
		}
	}
}