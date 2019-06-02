package view;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import model.Model; 

/** 
 * @author Pierre-Olivier
 * @version 1.0
 */
public class View extends JFrame
{

	private static final long serialVersionUID = 1L;
	private Model model;

	private static JFrame mainFrame;

/**
 * Appoints model object
 * 
 * @param model
 */
	public View(Model model) 
	{
		this.model = model;
	}

/**
 * Creates a window in wich the game is display
 * 
 * @param x
 * @param y
 * @throws IOException
 */
	public void show(int x , int y) throws IOException  
	{	
		mainFrame = new JFrame();
		this.setTitle("BoulderDash - The Game");
		this.setSize(x*33, y*33);
		this.setLocationRelativeTo(null);
		this.setResizable(true); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new FontPanel(model,x ,y));       
        this.addKeyListener(new keyControler());
        
        ImageIcon img = new ImageIcon("../ressources/icon.png");
        this.setIconImage(img.getImage());
	}

/**
 * Allows visibility and sets the contentPane property
 * 
 * @param model
 * @param x
 * @param y
 * @throws IOException
 */
	public void refresh(Model model, int x, int y) throws IOException
	{
		this.setContentPane(new FontPanel(model,x ,y));
		this.setVisible(true);
	}

/**
 * 
 * @return if wether or not a key is pressed
 */
	public int KeyUser()
	{
		return keyControler.getKeyUser(); 
	}
	
/**
 * 
 * @return the frame 
 */
	public static JFrame getMainFrame() 
	{
		return mainFrame;
	}

/**
 * Appoints mainframe object
 * 
 * @param mainFrame
 */
	public void setMainFrame(JFrame mainFrame) 
	{
		View.mainFrame = mainFrame;
	}
	
/**
 * Calls GameOvers method
 * 
 */
	public void GameOver()
	{
		GameOver.GameOvers();
	}

/**
 * Calls GameWins method
 * 
 */
	public void GameWin()
	{
		GameWin.GameWins();
	}
}