package paternsVectorLab7;

import java.io.*;
import java.util.*;

/**
 * Class for operations with arrays implements Vector
 * @author Krygin A.N.
 * @version 1.0
 */
public class ArrayVector implements Vector, Cloneable, Serializable, VectorFactory{
	private static final long serialVersionUID = -5576732613146316062L;
	private double[] array;

	public ArrayVector(int v) {
		this.array = new double[v];
	}

    public ArrayVector(){

    }

	/**
	 * Method for getting single element of the vector
	 * @param i - get element value
	 * @return this.arrs[i] - element of the vector
	 */
	public double getElementOfVector(int i) {
		return this.array[i];

	}

	/**
	 * Method for setting element of the the vector
	 * @param index - length of the vector
	 * @param element - element of the vector
	 * @return void
	 */
	public double setElementOfVector(int index, double element) {
		this.array[index] = element;
		return element;
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
			sbuffer.append("[" + this.getElementOfVector(i) + "] ");
		return "ArrayVector = " + sbuffer.toString();
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

    public Vector setVectorFactory(int size) {
        return new ArrayVector(size);
    }
}
