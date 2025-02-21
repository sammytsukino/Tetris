package tetris;

import java.awt.Color;
import java.awt.Point;


public class Tetromino {
	private Point[] shape;
	private Color color;
	
	public Tetromino(Point[] shape, Color color) {
		super();
		this.shape = shape;
		this.color = color;
	}

	public Point [] getShape () {
		return shape;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void rotate() {
		for (Point p : shape) {
			int temp = p.x;
			p.x = -p.x;
			p.y = temp;
		}
	}
	
	
}
