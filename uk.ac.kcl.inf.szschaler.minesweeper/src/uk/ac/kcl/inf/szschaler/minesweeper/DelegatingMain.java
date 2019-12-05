package uk.ac.kcl.inf.szschaler.minesweeper;

import uk.ac.kcl.inf.szschaler.minesweeper.model.cells.delegation_based.DelegationFactory;
import uk.ac.kcl.inf.szschaler.minesweeper.view.MineFieldFrame;

/**
 * Main class to run mine sweeper.
 * 
 * @author Steffen Zschaler
 */
public class DelegatingMain {

	public static void main(String[] args) {
		new MineFieldFrame(new DelegationFactory()).setVisible(true);
	}
}