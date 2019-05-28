package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ViewPanel extends JPanel
{	
	private static final long serialVersionUID = 1L;
	
	public int X = 1;
	protected int Y = 1;
	
	public ViewPanel()
	{
		
	}
	
	public void paint(Graphics graphics)
	{
		Image image;
		try 
		{
				image = ImageIO.read(new File("../ressources/terre.jpg"));
				graphics.drawImage(image, this.X*16, this.Y*16, this);
		}

		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void moveRight() {
        X = X + 2;
        repaint();
    }

    public void moveLeft() {
        X = X - 2;
        repaint();
    }

    public void moveDown() {
        Y = Y + 2;
        repaint();
    }

    public void moveUp() {
        Y = Y - 2;
        repaint();
    }
	
}	