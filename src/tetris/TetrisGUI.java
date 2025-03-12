package tetris;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TetrisGUI extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 300;
	private final int HEIGHT = 600;
	private final int TILE_SIZE = 30;
	private Timer timer;
	private int positionY = 0;
	
	public TetrisGUI() {
		setSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.BLACK);
		timer = new Timer (500, this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.PINK);
		
		g.fillRect(120, positionY, TILE_SIZE, TILE_SIZE);
		
		
	}
}

