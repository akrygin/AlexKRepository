package adapterVectorLab7;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 04.11.12
 * Time: 9:59
 * To change this template use File | Settings | File Templates.
 */
public class ProtectedVector implements VectorAdapter{
    private VectorAdapter protectedVector = new JLinkedListVector();

    public ProtectedVector(VectorAdapter vector){
        this.protectedVector = vector;
    }

    @Override
    public double getElementOfVector(int index) {
        return this.protectedVector.getElementOfVector(index);
    }

    @Override
    public double setElementOfVector(int index, double element) {
        return this.protectedVector.setElementOfVector(index, element);
    }

    @Override
    public void setVectorFromArray(double[] arrs) {
    }

    @Override
    public void setVectorFromVector(Collection<Double> arrs) {
    }

    @Override
    public int countVectorLength() {
        return this.protectedVector.countVectorLength();
    }

    @Override
    public String toString() {
        return "" + protectedVector;
    }
}

