package contract;

import java.util.Observable;

import entity.HelloWorld;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel 
{
	HelloWorld getHelloWorld();

	void loadHelloWorld(String code);
	
	Observable getObservable();
}
