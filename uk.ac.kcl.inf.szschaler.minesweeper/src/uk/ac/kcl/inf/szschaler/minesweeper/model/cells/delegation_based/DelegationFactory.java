package uk.ac.kcl.inf.szschaler.minesweeper.model.cells.delegation_based;

import uk.ac.kcl.inf.szschaler.minesweeper.model.cells.Cell;
import uk.ac.kcl.inf.szschaler.minesweeper.model.cells.CellFactory;

/**
 * A factory producing inheritance-based cells.
 * 
 * @author Steffen Zschaler
 */
public class DelegationFactory implements CellFactory {

	@Override
	public Cell createMine() {
		return new UndiscoveredCell(CellContents.MINE);
	}

	@Override
	public Cell createEmptyField(int numMines) {
		return new UndiscoveredCell(CellContents.values()[numMines]);
	}
}