package jVectorsLab4;

import java.util.*;

/**
 * @author Krygin A.N.
 * @param <E>
 */
public class JLinkedListVector implements Vector, Iterable<Double> {
	private List<Double> linkedVector;

	public List<Double> getLinkedVector() {
		return this.linkedVector;
	}

	public JLinkedListVector() {
		this.linkedVector = new LinkedList<Double>();
	}

	public JLinkedListVector(Double ... values) {
		this.linkedVector = new LinkedList<Double>();
		for (Double element : values)
			this.addElementOfVector(element);
	}

	public void addElementOfVector(Double element) {
		this.linkedVector.add(element);
	}

	public void setElementOfVector(int index, Double element) {
		this.linkedVector.set(index, element);
	}

	public void setVectorFromArray(double[] array) {
		for (Double element : array)
			this.addElementOfVector(element);
	}

	public int countVectorLength() {
		return this.linkedVector.size();
	}

	public Double getElementOfVector(int index) {
		return this.linkedVector.get(index);
	}
	public Iterator<Double> iterator(){
		return linkedVector.iterator();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JLinkedListVector other = (JLinkedListVector) obj;
		if (linkedVector == null) {
			if (other.linkedVector != null)
				return false;
		} else if (!linkedVector.equals(other.linkedVector))
			return false;
		return true;
	}
}
