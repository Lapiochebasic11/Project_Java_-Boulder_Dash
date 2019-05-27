package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
				image = ImageIO.read(new File("../view/oui.jpg"));
				graphics.drawImage(image, this.X*16, this.Y*16, this);
				
		}

		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
