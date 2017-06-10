package pl.lodz.uni.math.java.factory.sources;

import java.util.List;
import java.util.ArrayList;

import pl.lodz.uni.math.java.factory.IFactory;
import pl.lodz.uni.math.java.factory.domain.Person;

import pl.lodz.uni.math.java.factory.IFactory;
import pl.lodz.uni.math.java.factory.domain.Person;

public class XMLSource implements IFactory {

	private static IFactory instance = new XMLSource();

	private XMLSource() {
	}

	public static IFactory getInstance() {
		return instance;
	}

	@Override
	public Person getPersonById(int n) {
		Person user = new Person();
		System.out.println("user " + n + " \n (source - XML)");
		return user;

	}

	@Override
	public List<Person> getAllPersons() {
		System.out.println("XML - ListOfPersons...");
		List<Person> listOfPersons = new ArrayList<Person>();

		return listOfPersons;

	}

}
