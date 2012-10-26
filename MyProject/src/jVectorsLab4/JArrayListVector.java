package jVectorsLab4;

import java.util.*;

/**
 * @author Krygin A.N.
 * @param <E>
 */
public class JArrayListVector implements Vector, Iterable<Double>{
	private List<Double> arrayVector;

	public List<Double> getArrayVector() {
		return this.arrayVector;
	}

	public JArrayListVector() {
		this.arrayVector = new ArrayList<Double>();
	}

	public JArrayListVector(Double ... values) {
		this.arrayVector = new ArrayList<Double>();
		for (Double element : values)
			this.addElementOfVector(element);
	}

	public void addElementOfVector(Double element) {
		this.arrayVector.add(element);
	}

	public void setElementOfVector(int index, Double element) {
		this.arrayVector.set(index, element);
	}

	public void setVectorFromArray(double[] array) {
		for (double element : array)
			this.addElementOfVector(element);
	}

	public int countVectorLength() {
		return this.arrayVector.size();
	}

	public Double getElementOfVector(int index) {
		return this.arrayVector.get(index);
	}
	
	public Iterator<Double> iterator(){
		return arrayVector.iterator();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JArrayListVector other = (JArrayListVector) obj;
		if (arrayVector == null) {
			if (other.arrayVector != null)
				return false;
		} else if (!arrayVector.equals(other.arrayVector))
			return false;
		return true;
	}
}