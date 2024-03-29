package jVectorsLab4;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Class for operations with arrays implements Vector
 * 
 * @author Krygin A.N.
 * @version 1.0
 */
public class ArrayVector implements Vector, Cloneable, Iterable<Double>{
	private double[] array; 
	private int index;

	/**
	  * Constructor 
	  * @param v - takes vector's length
	  */
	public ArrayVector(int v) {
		this.array = new double[v];
	}

	/** 
	 * Method for getting single element of the vector
	 * @param i - get element value
	 * @return this.arrs[i] - element of the vector 
	 */
	public Double getElementOfVector(int i) {
		return this.array[i];

	}

	/**
	 * Method for setting element of the the vector
	 * @param i - length of the vector
	 * @param k - element of the vector
	 * @return void
	 */
	public void setElementOfVector(int index, Double element) {
		this.array[index] = element;
	}

	/**
	 * Method for setting full vector from the array
	 * @param arrs - input array
	 * @return void
	 */
	public void setVectorFromArray(double[] arrs) {
		if (this.countVectorLength() != arrs.length) {
			System.out.println("Array and vector aren't same in length ! Filling is dinied");
			return;
		}
		for (int i = 0; i < arrs.length; i++) {
			this.setElementOfVector(i, arrs[i]);
		}
	}

	/**
	 * Method for setting full vector from another vector
	 * @param <E>
	 * @param arrs - input vector
	 * @return void
	 */
	public void setVectorFromVector(Vector arrs) {
		for (int i = 0; i < this.countVectorLength(); i++) {
			this.setElementOfVector(i, arrs.getElementOfVector(i));
		}
	}
	
	/**
	 * Method for determine the length of the vector
	 * @return count - value of vector length
	 */
	public int countVectorLength() {
		int count = 0;
		for (int i = 0; i < this.array.length; i++)
			count++;
		return count;
	}

	/**
	 * Generates a string listing the elements of the vector
	 */
	@Override
	public String toString() {
		StringBuffer sbuffer = new StringBuffer();
		for (int i = 0; i < this.countVectorLength(); i++)
			sbuffer.append(" [" + i + " val - " + this.getElementOfVector(i) + "]");
		return "ArrayVector [toString()=" + sbuffer.toString() + "]";
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
		ArrayVector other = (ArrayVector) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		return true;
	}
	
	public ArrayVector clone() throws CloneNotSupportedException{
		ArrayVector clonedArr = (ArrayVector)super.clone();
		clonedArr.array = (double[]) array.clone();
		return clonedArr;
	}

	public Iterator<Double> iterator() {
		return new Iterator<Double>() {

			public boolean hasNext() {
				return index < countVectorLength();
			}

			public Double next() {
				return array[index++];
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
    }
}
