package pl.lodz.uni.math.java.factory.sources;

import java.util.List;
import java.util.ArrayList;

import pl.lodz.uni.math.java.factory.IFactory;
import pl.lodz.uni.math.java.factory.domain.Person;


public class DBSource implements IFactory {

	private static IFactory instance = new DBSource();

	private DBSource() {
	}
	public static IFactory getInstance()
	{
		return instance;
	}

	@Override
	public Person getPersonById(int n) {
		Person user=new Person();
		System.out.println("user "+n +" \n (source - DB)");
		return user;

	}

	@Override
	public List<Person> getAllPersons() {
		System.out.println("DB-ListOfPersons...");
		List<Person> listOfPersons = new ArrayList<Person>();

	      return listOfPersons;

	}

}
