package view;

import javax.swing.JFrame;

public class ViewFrame extends JFrame
{
	public ViewFrame() 
	{
		JFrame jframe = new JFrame();
		ViewPanel viewpanel = new ViewPanel();
		
		int width = 1920;
		int height = 1080;
		jframe.setSize(width, height);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("Boulder Dash");
		jframe.setContentPane(viewpanel);
	}
}

