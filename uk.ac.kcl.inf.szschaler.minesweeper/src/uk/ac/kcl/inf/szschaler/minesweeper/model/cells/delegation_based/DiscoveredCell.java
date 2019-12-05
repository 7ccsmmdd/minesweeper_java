package uk.ac.kcl.inf.szschaler.minesweeper.model.cells.delegation_based;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;

import uk.ac.kcl.inf.szschaler.minesweeper.model.cells.Cell;

/**
 * A cell that has already been discovered.
 * 
 * @author Steffen Zschaler
 */
public class DiscoveredCell implements Cell {

	private CellContents contents;

	public DiscoveredCell(CellContents contents) {
		this.contents = contents;
	}

	@Override
	public Component formatUIRepresentation(JButton jbUnclicked,
			JLabel jlClicked) {
		jlClicked.setText(contents.getLabelText());
		jlClicked.setForeground(Color.orange);
		return jlClicked;
	}

	@Override
	public boolean isDiscovered() {
		return true;
	}

	@Override
	public boolean isFlagged() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return contents == CellContents.ZERO;
	}

	@Override
	public boolean isMine() {
		return contents == CellContents.MINE;
	}

	@Override
	public Cell getDiscovered() {
		return this;
	}

	@Override
	public Cell getFlagToggled() {
		return this;
	}
}