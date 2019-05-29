package model.Element;

public interface Moves {

	void moveUp(int x, int y,model.Map map);

	void moveDown(int x, int y,model.Map map);

	void moveLeft(int x, int y,model.Map map);

	void moveRight(int x, int y,model.Map map);

}