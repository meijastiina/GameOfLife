package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.GameOfLife;

public class TestGrid {
	private GameOfLife game;
	
	@Before
	public void setup(){
		this.game = new GameOfLife(5);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
