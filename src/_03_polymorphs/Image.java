package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image extends Polymorph {
	public static BufferedImage image;

	Image(int x, int y) {
		super(x, y);
		width=275;
		height=183;
		// TODO Auto-generated constructor stub
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("download.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, 200, 200, width, height, null);
	}
}
