package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Emanuel Caracciolo
 * @version 1.0
 * 
 * @param <mainFrame> class type
 */

public class GamePanel<mainFrame> extends JPanel
{
	private static final long serialVersionUID = 1L;  
	private Image image;
	
	@SuppressWarnings("unused")
	private JFrame mainFrame;

/**
 * Appoint image object
 * 
 * @param image call image
 */
	public GamePanel(Image image) 
	{ 
		this.image = image;
	}

/**
 * 	Draw the component
 * 
 */
	public void paintComponentBefore()
	{
		paintComponent(this.getGraphics());
	}

/**
 * Draw the component and make it visible
 * 
 * @param g call a graphic context
 */
	protected void paintComponent(Graphics g) 
	{
		g.drawImage(image, 0, 0,  View.getMainFrame());
		this.setVisible(true);
	}
}