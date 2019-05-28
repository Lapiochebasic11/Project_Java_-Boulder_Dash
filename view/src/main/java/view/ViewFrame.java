package view;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class ViewFrame extends JFrame implements KeyListener
{
	private static final long serialVersionUID = 1L;
	public ViewPanel draw;
	public ViewFrame() 
	{
		JFrame jframe = new JFrame();
		ViewPanel viewpanel = new ViewPanel();
		
		/*int width = 1920;
		int height = 1080;
		jframe.setSize(width, height);
		jframe.setMinimumSize(new Dimension(1920, 1080));
		jframe.pack();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("Boulder Dash");
		jframe.setContentPane(viewpanel);*/

        this.draw=new ViewPanel();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
	}
	
	 public void keyPressed(KeyEvent e) 
	 	{
	        int a = 0;
	        a = a + 1; 
			System.out.println(a);
	    }

	    public void keyReleased(KeyEvent e) 
	    {
	        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
	            draw.moveRight();
	        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
	            draw.moveLeft();
	        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
	            draw.moveDown();
	        else if(e.getKeyCode()== KeyEvent.VK_UP)
	            draw.moveUp();
	        repaint();
	    }
	    
	    public void keyTyped(KeyEvent e) 
	    {
	        System.out.println("keyTyped");
	    }
}