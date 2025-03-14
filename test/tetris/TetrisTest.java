package tetris;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;
import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TetrisTest {
	private GameController game;
	private Board board;

	@BeforeEach
	void setUp() {
		game = new GameController();
		board = new Board();
	}

	@Test
	void testInitialScoreIsZero() {
		assertEquals(0, game.currentScore(), "La puntuación debe ser 0");
	}
	
	@Test
	void testPieceCanMoveDown() {
		Tetromino piece = new Tetromino(new Point[] {new Point(4,0), new Point(5,0) }, Color.RED);
		assertTrue(board.canMove(piece, 0, 1), "La pieza debería moverse hacia abajo");
	}
	
	@Test
	void testPieceCannotMoveOutsideLeft() {
		Tetromino piece = new Tetromino(new Point[] {new Point(0,0), new Point(1,0) }, Color.PINK);
		assertFalse(board.canMove(piece, -1, 0),"La pieza no debería de moverse fuera de la izquierda");
		
	}
	
	@Test
	void testLineClearIncreaseScore() {
		for (int x = 0; x > 10; x++) {
			board.grid[19][x] = Color.GREEN;
		}
		
	}
	}

