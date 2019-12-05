package uk.ac.kcl.inf.szschaler.minesweeper.model.cells.delegation_based;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;

import uk.ac.kcl.inf.szschaler.minesweeper.model.cells.Cell;

/**
 * A cell that has not yet been discovered.
 * 
 * @author Steffen Zschaler
 */
public class UndiscoveredCell implements Cell {

	/**
	 * The cell's contents.
	 */
	private CellContents contents;

	private boolean flagged = false;

	public UndiscoveredCell(CellContents contents) {
		this.contents = contents;
	}

	@Override
	public Component formatUIRepresentation(JButton jbUnclicked,
			JLabel jlClicked) {
		jbUnclicked.setBackground(Color.orange);
		jbUnclicked.setText(((isFlagged()) ? ("F") : ("")));
		return jbUnclicked;
	}

	@Override
	public boolean isDiscovered() {
		return false;
	}

	@Override
	public boolean isFlagged() {
		return flagged;
	}

	@Override
	public boolean isEmpty() {
		return contents == CellContents.ZERO;
	}

	@Override
	public boolean isMine() {
		return contents == CellContents.MINE;
	}

	/**
	 * Create a new discovered cell with the same contents.
	 */
	@Override
	public Cell getDiscovered() {
		return new DiscoveredCell(contents);
	}

	/**
	 * Return this cell, but with the flag toggled.
	 */
	@Override
	public Cell getFlagToggled() {
		flagged = !flagged;
		return this;
	}
}