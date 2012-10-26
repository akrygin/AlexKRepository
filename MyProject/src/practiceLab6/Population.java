package practiceLab6;

import java.io.*;
import java.util.*;

public class Population implements Set<Person>, Iterable<Person>, Serializable {
	private static final long serialVersionUID = -1479332884025677791L;
	private HashSet<Person> personArray;

	public Population(HashSet<Person> NewArrayPerson){
		this.personArray = new HashSet<Person>(NewArrayPerson);
	}
	
	public boolean add(Person k) {
		return this.personArray.add(k);
	}

	public boolean addAll(Collection<? extends Person> arg0) {
		return personArray.addAll(arg0);
	}

	public void clear() {
		this.personArray.clear();
	}

	public boolean contains(Object arg0) {
		return this.personArray.contains(arg0);
	}

	public boolean containsAll(Collection<?> arg0) {
		return personArray.containsAll(arg0);
	}

	public boolean isEmpty() {
		return this.personArray.isEmpty();
	}

	public Iterator<Person> iterator() {
		return this.personArray.iterator();
	}

	public boolean remove(Object arg0) {
		return this.personArray.remove(arg0);
	}

	public boolean removeAll(Collection<?> arg0) {
		return this.personArray.removeAll(arg0);
	}

	public boolean retainAll(Collection<?> arg0) {
		return this.personArray.retainAll(arg0);
	}

	public int size() {
		return this.personArray.size();
	}

	public Object[] toArray() {
		return this.personArray.toArray();
	}

	public <T> T[] toArray(T[] arg0) {
		return this.personArray.toArray(arg0);
	}
	
	public void saveAll(String fileName) throws IOException{
		FileOutputStream outputFileStream = new FileOutputStream(fileName);
		ObjectOutputStream outputObjectStream = new ObjectOutputStream(outputFileStream);
		outputObjectStream.writeObject(personArray);
		outputObjectStream.close();
		outputFileStream.close();
	}
	
	@SuppressWarnings("unchecked")
	public void loadAll(String fileName) throws IOException, ClassNotFoundException{
		FileInputStream inputFileStream = new FileInputStream(fileName);
		ObjectInputStream inputObjectStream = new ObjectInputStream(inputFileStream);
		personArray = new HashSet<Person>((HashSet<Person>) inputObjectStream.readObject());
		inputObjectStream.close();
	}
	
	public Collection<Person> find(String lastName){
		HashSet<Person> returnCollection = new HashSet<Person>();
		for(Person element: personArray){
			if(element.getPersonSurname().equals(lastName)) returnCollection.add(element);
		}
		return returnCollection;
	}

	public String toString() {
		return "Population " + personArray;
	}
}
