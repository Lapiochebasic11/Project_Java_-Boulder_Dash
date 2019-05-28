package  model.Element;



public abstract class ElementFactory {
	
	public static Rock Rock = new Rock();
	public static Empty Empty = new Empty();
	public static Enemy Enemy = new Enemy();
	public static Exit Exit = new Exit();
	public static Ground Ground = new Ground();
	public static Player Player = new Player();
	public static Wall Wall = new Wall();
	public static Diamond Diamond = new Diamond();
	
	private static Element[] element = {Rock,Diamond,Enemy,Player,Empty,Ground,Exit,Wall};
	
	public static Element getObject(String object) {
		
		for (final Element Element : element ) {
			if (Element.getSprite().compareTo(object+"png") == 0) {
				return Element;
			}
		}
		return Empty;
	}
	
    }
