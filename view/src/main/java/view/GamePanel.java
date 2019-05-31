package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class GamePanel<mainFrame> extends JPanel
{
	private static final long serialVersionUID = 1L;  
	private Image image;
	@SuppressWarnings("unused")
	private JFrame mainFrame;

	public GamePanel(Image image) 
	{ 
		this.image = image;
		mainFrame = View.getMainFrame();
	}

	public void paintComponentBefore()
	{
		paintComponent(this.getGraphics());
	}

	protected void paintComponent(Graphics g) 
	{
		g.drawImage(image, 0, 0,  View.getMainFrame());
		this.setVisible(true);
	}
}