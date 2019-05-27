package Element;

public abstract class ElementFactory {
	
	public static Rock Rock = new Rock();
	public static Empty Empty = new Empty();
	public static Enemy Enemy = new Enemy();
	public static Exit Exit = new Exit();
	public static Ground Ground = new Ground();
	public static Player Player = new Player();
	public static Wall Wall = new Wall();
}
