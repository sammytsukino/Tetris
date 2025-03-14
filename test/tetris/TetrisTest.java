package tetris;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	
}