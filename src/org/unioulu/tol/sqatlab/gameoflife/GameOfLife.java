package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Random;

public class GameOfLife {
	private Grid grid;
	
	public GameOfLife(int size) {
		this.grid = new Grid(size);
	}
	
	public Cell getCell(int x, int y) {
		return this.grid.getCell(x, y);
	}
	public int getNeighbourCount(int x, int y) {
		return this.grid.getNeighbourCount(x,y);
	}
}
