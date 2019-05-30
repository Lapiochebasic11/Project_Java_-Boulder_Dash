package view;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model; 





public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	private Model model;

	  private static JFrame mainFrame;
	
	private GamePanel gamePanel;

	
	public View(Model model) {
		this.model = model;
	}
  

	public void show(int x , int y) throws IOException  
	{	
		mainFrame = new JFrame();
		this.setTitle("BoulderDash-The Game");
		this.setSize(x*34, y*34);
		this.setLocationRelativeTo(null);
		this.setResizable(true);    //block windows size
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new FontPanel(model,x ,y));
		        
        this.addKeyListener(new keyControler());
		
		//System.out.println(x);
		//System.out.println(y);
	}

	
	
	/*public void showPanel (int width, int height, String sprite,int score)
	{
		GamePanel pan;
		try {
			pan = new GamePanel(sprite, width, height,  score );
			pan.paintComponentBefore();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		//System.out.println(sprite);
	}
	*/

	public int KeyUser()
	{
		return keyControler.getKeyUser(); 
	}





public static JFrame getMainFrame() {
	return mainFrame;
}


public void setMainFrame(JFrame mainFrame) {
	this.mainFrame = mainFrame;
}
}