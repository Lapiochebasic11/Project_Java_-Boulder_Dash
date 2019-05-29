package view;

import model.Model;
import view.ViewFrame;

public class View
{
	private Model model;
	public View(Model model) 
    {
		this.model = model;
		ViewFrame viewframe = new ViewFrame();
		viewframe.Windows(0, 0);
    }

	public int KeyUser()
	{
		return ViewFrame.getKeyUser(); 
	}

}
