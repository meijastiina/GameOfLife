package org.unioulu.tol.sqatlab.gameoflife;

import java.util.Random;

public class Grid {
	private Cell arrGrid[][];
	private int size;
	
	public Grid(int size) {
		this.size = size;
		this.arrGrid = new Cell[size][size];
		Random randomGenerator = new Random();
		randomGenerator.nextInt(1); 
	        for (int i =0; i<size; i++)
	        {
	        	for (int j = 0; j<size; j++) {
	        		Cell cell = new Cell(randomGenerator.nextInt(1));
	        		this.arrGrid[i][j] = cell;
	        	}
	        }
	}
	public Cell getCell(int x, int y) {
		return arrGrid[x][y];
	}
	public int getNeighbourCount(int x, int y){
		int retVal = 8;
		if (x==0 && y==0 || x==0 && y==size || x==size && y==0 || x==size && y==size) {
			retVal = 3;
		} else if (x==size || y==size) {
			retVal = 5;
		}
		return retVal;
	}
}
