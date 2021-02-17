package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Polymorph {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	MovingMorph mm; 
	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
		mm=new MovingMorph(150,150);
	}

	public void update() {
		
	}

	public abstract void draw(Graphics g);
	
}
