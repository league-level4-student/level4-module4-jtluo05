package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseMorph extends Polymorph implements MouseListener{
int x1=0;
int y1=0;
	MouseMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.cyan);
		g.fillRect(x, y, 75, 150);
	}

		    public void update(){
		    	
}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				x=e.getX();
				y=e.getY();
			}

}
