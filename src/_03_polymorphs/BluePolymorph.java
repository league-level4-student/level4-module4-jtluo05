package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		width=100;
		height=100;
		g.setColor(Color.blue);
		g.fillRect(x, y, 75, 50);
	}
	
}
