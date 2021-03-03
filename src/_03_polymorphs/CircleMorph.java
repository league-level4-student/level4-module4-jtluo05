package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	double degree = 0;

	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, 75, 75);
	}

	public void update() {
		x =x +  (int)(50*Math.cos(degree));
		y = y + (int) (50*Math.sin(degree));
degree++;
	}

}
