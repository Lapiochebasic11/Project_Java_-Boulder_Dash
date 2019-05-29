package model.Element;

public interface IElement {

	String getSprite();


	void destruction(int x, int y,model.Map map);


	void walkOver(int x, int y,  char direction,model.Map map);


	void move(int x, int y, int direction,model.Map map);

}