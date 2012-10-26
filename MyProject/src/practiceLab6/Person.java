package practiceLab6;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = -650004142717792014L;
	private String personSurname;
	private String personName;
	private String personMiddlename;
	private String personDateOfBirth;
	
	public Person(String s, String n, String m, String d){
		this.personSurname = s;
		this.personName = n;
		this.personMiddlename = m;
		this.personDateOfBirth = d;		
	}
	
	public String getPersonSurname() {
		return personSurname;
	}
	
	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonMiddlename() {
		return personMiddlename;
	}
	
	public void setPersonMiddlename(String personMiddlename) {
		this.personMiddlename = personMiddlename;
	}
	public String getPersonDateOfBirth() {
		return personDateOfBirth;
	}
	
	public void setPersonDateOfBirth(String personDateOfBirth) {
		this.personDateOfBirth = personDateOfBirth;
	}

	public String toString() {
		return "Person[" + personSurname + " " + personName + " " + personMiddlename + " " + personDateOfBirth + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((personDateOfBirth == null) ? 0 : personDateOfBirth
						.hashCode());
		result = prime
				* result
				+ ((personMiddlename == null) ? 0 : personMiddlename.hashCode());
		result = prime * result
				+ ((personName == null) ? 0 : personName.hashCode());
		result = prime * result
				+ ((personSurname == null) ? 0 : personSurname.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (personDateOfBirth == null) {
			if (other.personDateOfBirth != null)
				return false;
		} else if (!personDateOfBirth.equals(other.personDateOfBirth))
			return false;
		if (personMiddlename == null) {
			if (other.personMiddlename != null)
				return false;
		} else if (!personMiddlename.equals(other.personMiddlename))
			return false;
		if (personName == null) {
			if (other.personName != null)
				return false;
		} else if (!personName.equals(other.personName))
			return false;
		if (personSurname == null) {
			if (other.personSurname != null)
				return false;
		} else if (!personSurname.equals(other.personSurname))
			return false;
		return true;
	}
}
