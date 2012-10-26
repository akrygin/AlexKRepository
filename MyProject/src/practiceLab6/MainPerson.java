package practiceLab6;

import java.io.*;
import java.util.*;

public class MainPerson {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		HashSet<Person> a = new HashSet<Person>();
		a.add(new Person("Shevchenko", "Andrey", "Vasiliy", "03.02.1998"));
		a.add(new Person("Backhem", "David", "Nick", "03.02.1980"));
		a.add(new Person("Backhem", "David", "Nick", "03.02.1980"));
		Population b = new Population(a);
		System.out.println("Before Serial - " + b);
		b.saveAll("serLab6File.out");
		b.loadAll("serLab6File.out");
		System.out.println("After serial  - " + b);
		System.out.println("Find          - " + b.find("Backhem"));
	}
}
