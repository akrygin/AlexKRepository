package adapterVectorLab7;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 04.11.12
 * Time: 9:51
 * To change this template use File | Settings | File Templates.
 */
public class JVectorAdapter {
    public VectorAdapter vectorConvertation(Vector<Double> vector){
        VectorAdapter userVectorObj = new JLinkedListVector();
        userVectorObj.setVectorFromVector(vector);
        return userVectorObj;
    }
}
