package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ViewPanel extends JPanel
{	
	public ViewPanel()
	{
		
	}
	
	public void paint(Graphics graphics)
	{
		Image image;
		try 
		{

				image = ImageIO.read(new File("../view/oui.jpg"));
				graphics.drawImage(image, 16, 16, this);
				
		}

		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
