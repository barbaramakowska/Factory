package pl.lodz.uni.math.java.factory;

import pl.lodz.uni.math.java.factory.ETypeOfSource;

public class Main {

	public static void main(String[] args) {
		Factory factory=new Factory();
		factory.setSource(ETypeOfSource.db);
		factory.getAllPersons();
		factory.getPersonById(5);
		factory.setSource(ETypeOfSource.txt);
		factory.getPersonById(90);
		
		

	}

}
