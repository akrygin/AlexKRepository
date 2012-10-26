package vectorsLab3;

/**
 * Interface for working with data arrays, double vectors and linked lists
 * @author Krygin A.N.
 * @version 1.0
 */
public interface Vector {
	public double getElementOfVector(int index);
	public double setElementOfVector(int index, double element);
	public void setVectorFromArray(double[] arrs);
	public void setVectorFromVector(Vector arrs);
	public int countVectorLength();
}
