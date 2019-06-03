package controller;

import java.io.IOException;

import model.* ;
import view.View; 

/**
 * @author Pierre-Olivier Schaller
 * @version 1.0
 */
public class Controller
{
	private Model model;
	private View view;
	private int num = 0;
	
/**
 * The game is being played, it prints the game in the console and detect if the player win or lose
 * 
 * @throws IOException Signals that an I/O exception of some sort has occurred
 */
	public void play() throws IOException 
	{
		view.show(model.getMap().getWidth(), model.getMap().getHeight());
		model.gamethemestart();
		while (model.getMap().getWin() == false && model.getMap().getLose() == false)
		{
			view.refresh(model, model.getMap().getWidth(), model.getMap().getHeight());
			try 
			{
				Thread.sleep(10);
			} 
			
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			num = view.KeyUser();
			for(int y = model.getMap().getHeight() -1 ; y >= 0 ; y--){
				for(int x = 0; x < model.getMap().getWidth()  ; x++){
					
					
					if (model.getMap().getOnTheMapXY(x,y).getSprite()=="PLAYER.jpg"){
						model.getMap().getOnTheMapXY(x, y).move(x, y , num , model.getMap());
						num = 0;
					}
					
					else
					{
						model.getMap().getOnTheMapXY(x, y).move(x, y ,(int) (Math.random() * (0+10)), model.getMap());
					}
					
					if (model.getMap().getScoreNeeded() == model.getMap().getScore() ){
						if (model.getMap().getOnTheMapXY( model.getMap().getExitX(),model.getMap().getExitY()).getSprite() =="PLAYER.jpg")  {
							model.getMap().setWin(true);
						}
						model.getMap().spawnExit();
					}
				}
				
			}
			
			for(int y = 0 ; y < model.getMap().getHeight() ; y++)
			{
				
				for(int x = 0; x < model.getMap().getWidth()  ; x++)
				{
				  model.getMap().getOnTheMapXY(x, y).setWalk(0); 
				}
				
			}
			
			for(int y = 0 ; y < model.getMap().getHeight() ; y++)
			{
				
				for(int x = 0; x < model.getMap().getWidth()  ; x++)
				{
					
					switch (model.getMap().getOnTheMapXY(x, y).getSprite())
					{
						case "ROCK.jpg":
							System.out.print("O ");
							break;

						case "BORDER.jpg":
							System.out.print("[]");
							break;
						
						case "DIAMOND.jpg":
							System.out.print("V ");
							break;
						
						case "DOOR.jpg":
							System.out.print("D ");
							break;
						
						case "SOIL.jpg":
							System.out.print("* ");
							break;
						
						case "PLAYER.jpg":
							System.out.print("P ");
							break;

						case "ENEMY.jpg":
							System.out.print("X ");
							break;

						case "VOID.jpg":
							System.out.print("  ");
							break;
					}
				}
				System.out.println("");
				
			}
			System.out.println("");
			
		}
		
		if (model.getMap().getLose() == false )
		{
			System.out.println("Success");
			view.GameWin();
			model.winsound();
			model.gamethemestop();
		}
		
		else
		{
			System.out.println("Lose");
			view.GameOver();
			model.losesound();
			model.gamethemestop();
		}
	}

/**
 * 
 * @return model object
 */
	public Model getModel() 
	{
		return this.model;
	}

/**
 * 
 * @return view object
 */
	public View getView() 
	{
		return this.view;
	}

/**
 * Appoint model and view objects
 * 
 * @param view call view
 * @param model call model
 */
	public Controller(View view, Model model) 
	{
		this.view = view;
		this.model = model;
	}

/**
 * Appoint model object
 * 
 * @param model call model
 */
	public void setModel(Model model) 
	{
		this.model = model;
	}

/**
 * Appoint view object
 * 
 * @param view call view
 */
	public void setView(View view) 
	{
		this.view = view;
	}
	
}