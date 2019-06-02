package view;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import model.Model; 

public class View extends JFrame
{

	private static final long serialVersionUID = 1L;
	private Model model;

	private static JFrame mainFrame;
	
	public View(Model model) 
	{
		this.model = model;
	}

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
	
	public void refresh(Model model, int x, int y) throws IOException
	{
		this.setContentPane(new FontPanel(model,x ,y));
		this.setVisible(true);
	}

	public int KeyUser()
	{
		return keyControler.getKeyUser(); 
	}

	public static JFrame getMainFrame() 
	{
		return mainFrame;
	}


	public void setMainFrame(JFrame mainFrame) 
	{
		View.mainFrame = mainFrame;
	}
	
	public void GameOver()
	{
		GameOver.GameOvers();
	}

	public void GameWin()
	{
		GameWin.GameWins();
	}
}