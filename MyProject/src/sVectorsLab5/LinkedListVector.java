package sVectorsLab5;

import java.io.Serializable;

/**
 * Class for operations with Linked List implements Vector
 * 
 * @author Krygin A.N.
 * @version 1.0
 */
public class LinkedListVector implements Vector, Cloneable, Serializable {
	private static final long serialVersionUID = 8444994834660992443L;
	private Entry header = new Entry(0, null, null);
	private int size = 0;

	public LinkedListVector() {
		header.nextElement = header.prevElement = header;
	}

	/**
	 * Method for adding element in the end of the list
	 * @param element - value of element of the list
	 * @return void 
	 */
	public void addElementOfVector(double element) {
		Entry newEntry = new Entry(element, header, header.prevElement);
		newEntry.prevElement.nextElement = newEntry;
		newEntry.nextElement.prevElement = newEntry;
		size++;
	}

	/**
	 * Method for adding element in the end of list by index 
	 * @param index - index of element in the list
	 * @param element - value of element of the list
	 * @return void
	 */
	public void addElementOfVectorByIndex(int index, double element) {
		addElement(element, (index == size ? header : entry(index)));
	}
	
	/**
	 * Method for setting element of the list
	 * @param index - index of element in the list
	 * @param element - value of element of the list
	 * @return oldVal  - new value of the list
	 */
	public double setElementOfVector(int index, double element) {
         Entry e = entry(index);
         double oldVal = e.currentElement;
         e.currentElement = element;
         return oldVal;
     }
	
	/**
	 * Method for setting full vector from the array
	 * @param arrs - input array
	 * @return void
	 */
	public void setVectorFromArray(double[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			this.addElementOfVector(arrs[i]);
		}
	}

	/**
	 * Method for setting full linked list from another linked list
	 * @param arrs - input vector
	 * @return void
	 */
	public void setVectorFromVector(Vector arrs) {
		for (int i = 0; i < arrs.countVectorLength(); i++) {
			this.addElementOfVector(arrs.getElementOfVector(i));
		}
	}
	
	/**
	 * Method for removing element from list by index
	 * @param index - index of element in the list
	 * @return removeEl() - 
	 */
	public double removeElementOfVectorByIndex(int index) {
        return removeEl(entry(index));
    }
	
	/**
	 * Method to determine the length of the list
	 * @return size - a value of length
	 */
	public int countVectorLength() {
		return size;
	}
	
	/**
	 * Method for getting single element from the list
	 * @param index - index of the list
	 * @return entry(index) - indexed entry
	 */
	public double getElementOfVector(int index) {
		return entry(index).currentElement;
	}

	/**
	 * Method for checking element from the list by index
	 * @param index - index of the list
	 * @return e - the indexed entry
	 */
	private Entry entry(int index) {
		Entry e = header;
		if (index < (size >> 1)) {
			for (int i = 0; i <= index; i++)
				e = e.nextElement;
		} else {
			for (int i = size; i > index; i--)
				e = e.prevElement;
		}
		return e;
	}
	
	/**
	 * Method for adding element to the list
	 * @param element - head element
	 * @param entry - linked element
	 * @return newEntry - new element of the list
	 */
	private Entry addElement(double element, Entry entry) {
		Entry newEntry = new Entry(element, entry, entry.prevElement);
		newEntry.prevElement.nextElement = newEntry;
		newEntry.nextElement.prevElement = newEntry;
		size++;
		return newEntry;
	}
	
	/**
	 * Method for removing element from the list
	 * @param element - indexed element of the list for removing
	 * @return result - removing element from the list
	 */
	private double removeEl(Entry element) {
		double result = element.currentElement;
		element.prevElement.nextElement = element.nextElement;
		element.nextElement.prevElement = element.prevElement;
		element.nextElement = element.prevElement = null;
		element.currentElement = 0;
		size--;
		return result;
	}
	
	/**
	 * Class for creating new element in Linked List
	 * @author Krygin A.N.
	 * @version 1.0
	 */
	class Entry implements Cloneable, Serializable {
		private static final long serialVersionUID = 129125737945414643L;
		double currentElement;
		private Entry nextElement;
		private Entry prevElement;

		public Entry(double e, Entry n, Entry p) {
			this.currentElement = e;
			this.nextElement = n;
			this.prevElement = p;
		}
	}
	
	/**
	 * Generates a string listing the elements of the vector
	 */
	@Override
	public String toString() {
		StringBuffer sbuffer = new StringBuffer();
		for (int i = 0; i < this.countVectorLength(); i++)
			sbuffer.append("[" + this.getElementOfVector(i) + "] ");
		return "LinkedListVector = " + sbuffer.toString();
	}

	/**
	 * Generates a unique key of the object
	 */
	@Override
	public int hashCode() {
		long bytesumm = 0;
		for (int i = 0; i < this.countVectorLength(); i++)
			bytesumm += Double.doubleToLongBits(this.getElementOfVector(i));
		long left = bytesumm << 32;
		long right = bytesumm >> 32;
		long result = left ^ right;
		return (int) result;
	}

	/**
	 * Equals - comparison objects in null, class, hasCode
	 * return true if objects are equal, false if objects aren't equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.hashCode() == obj.hashCode())
			return true;
		if (obj instanceof Vector)
			return false;
		LinkedListVector other = (LinkedListVector) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		return true;	
	}
	
	/**
	 * Method for cloning class LinkedListVector
	 * @return cloned
	 * @throws CloneNotSupportedException 
	 */
	@Override
	public LinkedListVector clone() throws CloneNotSupportedException {
		LinkedListVector clone = null;
		clone = (LinkedListVector) super.clone();
        clone.header = new Entry(0, null, null);
        clone.header.nextElement = clone.header.prevElement = clone.header;
        clone.size = 0;
        for (Entry e = header.nextElement; e != header; e = e.nextElement)
            clone.addElementOfVector(e.currentElement);
        return clone;
    }
}


