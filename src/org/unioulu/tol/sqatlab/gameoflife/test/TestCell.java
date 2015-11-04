package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.*;
public class TestCell {
private GameOfLife game;
private int size;
	@Before
	public void setup(){
		this.size = 6;
		this.game = new GameOfLife(size);
	}
	@Test
	public void testCellStateDeadInitial() {
		Cell cell = new Cell(0);
		int strActualResult = cell.getState();
		int strExpectedResult = 0;
		assertEquals(strExpectedResult, strActualResult);
	}
	
	@Test
	public void testCellStateAliveInitial() {
		Cell cell = new Cell(1);
		int strActualResult = cell.getState();
		int strExpectedResult = 1;
		assertEquals(strExpectedResult, strActualResult);
	}

	@Test
	public void testCellStateAliveInitialChangedToDead() {
		Cell cell = new Cell(1);
		cell.setState(0);
		int strActualResult = cell.getState();
		int strExpectedResult = 0;
		assertEquals(strExpectedResult, strActualResult);
	}
	@Test
	public void testCellNeighbourCountUpperLeftCorner() {
		int intExpectedResult = 3;
		try {
			int intActualResult = game.getNeighbourCount(0,0);
			assertEquals(intExpectedResult, intActualResult);
		}catch(Exception e) {
			throw new Error("CustomLifeException (" + e + ")");
		}
	}
	@Test
	public void testCellNeighbourCountUpperRightCorner() {
		int intExpectedResult = 3;
		try {
			int intActualResult = game.getNeighbourCount(0,size);
			assertEquals(intExpectedResult, intActualResult);
		}catch(Exception e) {
			throw new Error("CustomLifeException (" + e + ")");
		}
	}
	@Test
	public void testCellNeighbourCountBottomLeftCorner() {
		int intExpectedResult = 3;
		try {
			int intActualResult = game.getNeighbourCount(size, 0);
			assertEquals(intExpectedResult, intActualResult);
		}catch(Exception e) {
			throw new Error("CustomLifeException (" + e + ")");
		}
	}
	@Test
	public void testCellNeighbourCountBottomRightCorner() {
		int intExpectedResult = 3;
		try {
			int intActualResult = game.getNeighbourCount(size, size);
			assertEquals(intExpectedResult, intActualResult);
		}catch(Exception e) {
			throw new Error("CustomLifeException (" + e + ")");
		}
	}
	@Test
	public void testCellNeighbourBorderNotCorner() {
		int intExpectedResult = 5;
		try {
			int intActualResult = game.getNeighbourCount(size, size-1);
			assertEquals(intExpectedResult, intActualResult);
		}catch(Exception e) {
			throw new Error("CustomLifeException (" + e + ")");
		}
	}
	@Test
	public void testCellNeighbourMiddle() {
		int intExpectedResult = 8;
		try {
			int intActualResult = game.getNeighbourCount(size-2, size-2);
			assertEquals(intExpectedResult, intActualResult);
		}catch(Exception e) {
			throw new Error("CustomLifeException (" + e + ")");
		}
	}
	

}
