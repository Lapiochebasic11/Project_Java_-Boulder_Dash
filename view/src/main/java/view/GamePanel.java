package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class GamePanel<mainFrame> extends JPanel{

	
	private static final long serialVersionUID = 1L;
	private String spriteName ; 
	private int score;  
	private Image image;
	private JFrame mainFrame;

	public GamePanel(Image image) { 
		this.image = image;
		mainFrame = View.getMainFrame();
		//System.out.println("construteur gamepanel");
	}

	public void paintComponentBefore(){
		paintComponent(this.getGraphics());
	}
	

	protected void paintComponent(Graphics g) {
		
		//System.out.println("yo paint component");
		
		g.drawImage(image, 0, 0,  View.getMainFrame());
		this.setVisible(true);
	}
}