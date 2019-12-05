/**
 * This package contains an implementation of cells based on delegation rather than inheritance. 
 * Note that we have split the management of cell state into two parts: sub-classes of Cell 
 * manage the discovery and flag state, while the different instance of the CellContents enum 
 * manage what the cell contains.
 *  
 * @author Steffen Zschaler
 */
package uk.ac.kcl.inf.szschaler.minesweeper.model.cells.delegation_based;