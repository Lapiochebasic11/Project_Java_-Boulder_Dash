package model.Element;

import java.io.*;
import sun.audio.*;

/**
 * 
 * @author Emanuel Caracciolo
 * @version 1.0
 */
public class SoundBox 
{
	@SuppressWarnings("restriction")
	private static AudioStream audio;
	
	/**
	 * make sound when you a diamond
	 */
	@SuppressWarnings("restriction")
	public static void diamondget()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/diamondget.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("diamond sound file unreadable");
		}
	}
	
	/**
	 * make sound when you kill a enemy
	 */
	@SuppressWarnings("restriction")
	public static void enemydie()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/oof.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("oof sound file unreadable");
		}
	}
	
	/**
	 * make sound when you die
	 */
	@SuppressWarnings("restriction")
	public static void playerdie()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/lose.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("lose sound file unreadable");
		}
	}
	
	/**
	 * make sound when you win
	 */
	@SuppressWarnings("restriction")
	public static void playerwin()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/win.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("win sound file unreadable");
		}
	}
	
	/**
	 * make sound when you start the game
	 */
	@SuppressWarnings("restriction")
	public static void themestart()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/theme.wav"));
			audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("theme sound file unreadable");
		}
	}
	
	/**
	 * stop the game sound 
	 */
	@SuppressWarnings("restriction")
	public static void themestop()
	{
		try 
		{
			AudioPlayer.player.stop(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("theme sound file unreadable");
		}
	}
}
