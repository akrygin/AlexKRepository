package paternsVectorLab6;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 29.10.12
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class ArrayCreator implements VectorFactory{
    public ArrayVector createVector(int size) {
        return new ArrayVector(size);
    }
}
