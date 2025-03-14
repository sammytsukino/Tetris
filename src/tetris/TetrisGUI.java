package tetris; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TetrisGUI extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 300;
	private final int HEIGHT = 600;
	private final int TITLE_SIZE = 30;
	private Timer timer;
	private int positionY = 0;
	
	public TetrisGUI() {
		setSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.BLACK);
		timer = new Timer(500, this);
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		
		g.fillRect(120, positionY, TITLE_SIZE, TITLE_SIZE);
		g.fillRect(120, positionY + TITLE_SIZE, TITLE_SIZE, TITLE_SIZE);
		g.fillRect(120, positionY + 2 * TITLE_SIZE, TITLE_SIZE, TITLE_SIZE);
		g.fillRect(120, positionY + 3 * TITLE_SIZE, TITLE_SIZE, TITLE_SIZE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (positionY + 4 * TITLE_SIZE < HEIGHT) {
			positionY += TITLE_SIZE;
		} else {
			positionY = 0;
		}
		repaint();
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tetris");
		TetrisGUI game = new TetrisGUI();
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}