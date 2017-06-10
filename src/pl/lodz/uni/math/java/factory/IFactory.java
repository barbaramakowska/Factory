package pl.lodz.uni.math.java.factory;

import java.util.List;
import pl.lodz.uni.math.java.factory.domain.Person;

 

public interface IFactory {
	public List<Person> getAllPersons();

	public Person getPersonById(int n);

	
	
	// public List<Person> getAllPersons(){}
	// public Person getPersonById()

}