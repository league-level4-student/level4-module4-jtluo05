package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	static ArrayList<Polymorph> poly;
	static Polymorph blue = new BluePolymorph(50, 50);
	static Polymorph red = new RedMorph(50, 50);
	static Polymorph moving = new MovingMorph(100, 100);
	static Polymorph circle = new CircleMorph(25, 25);
	static Polymorph mouse = new MouseMorph(25, 25);
	static Polymorph image = new Image(25, 25);

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		timer = new Timer(1000 / 30, this);
		timer.start();
		window.addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
		poly = new ArrayList<Polymorph>();

		poly.add(blue);
		poly.add(red);
		poly.add(moving);
		poly.add(circle);
		poly.add(mouse);
		poly.add(image);
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 1000, 1000);

		// draw polymorph
		if (poly != null) {
			for (Polymorph p : poly) {
				p.update();
				p.draw(g);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mouse.x = e.getX();
		mouse.y = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
