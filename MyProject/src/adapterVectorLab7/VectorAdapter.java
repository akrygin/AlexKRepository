package adapterVectorLab7;

import java.util.Collection;
import java.util.Vector;

/**
 * Interface for working with data arrays, double vectors and linked lists
 * @author Krygin A.N.
 * @version 1.0
 */
public interface VectorAdapter {
	public double getElementOfVector(int index);
	public double setElementOfVector(int index, double element);
	public void setVectorFromArray(double[] arrs);
	public void setVectorFromVector(Collection<Double> arrs);
	public int countVectorLength();
}
