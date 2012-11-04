package jVectorsLab4;

/**
 * Interface for working with data arrays, double vectors and linked lists
 * @author Krygin A.N.
 * @version 1.0
 */
public interface Vector {
	 public Double getElementOfVector(int index);	 
	 public void setElementOfVector(int index, Double item);	 
	 public void setVectorFromArray(double[] array);	 	 
	 public int countVectorLength();	 
	}
