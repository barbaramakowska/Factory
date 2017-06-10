package pl.lodz.uni.math.java.factory;

import java.util.HashMap;
import java.util.List;

import pl.lodz.uni.math.java.factory.domain.Person;
import pl.lodz.uni.math.java.factory.sources.XMLSource;
import pl.lodz.uni.math.java.factory.sources.DBSource;
import pl.lodz.uni.math.java.factory.sources.TXTSource;

//import pl.lodz.uni.math.java.Singleton;

public class Factory implements IFactory {
	//private static Factory instance =new Factory();

	//private Factory() {
	//	System.out.println("Factory.Factory() - konstruktor");
	//}

	//public enum ETypeOfSource {
		//xml, txt, db
	//}//

	HashMap<ETypeOfSource, IFactory> mapOfSources = new HashMap<>();
	{
		mapOfSources.put(ETypeOfSource.xml, XMLSource.getInstance());
		mapOfSources.put(ETypeOfSource.db, DBSource.getInstance());
		mapOfSources.put(ETypeOfSource.txt, TXTSource.getInstance());
	}
	IFactory factory=null;
	

	public  void setSource(ETypeOfSource type) {
		factory=mapOfSources.get(type);
	}

	//public static Factory getInstance() {
		//System.out.println("yes getInstance");
		//return instance;
	//}

	@Override
	public List<Person> getAllPersons() {
		return factory.getAllPersons();
		

	}

	public Person getPersonById(int n) {
		return factory.getPersonById(n);

	}

}
