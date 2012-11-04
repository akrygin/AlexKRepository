package adapterVectorLab7;

import java.util.Vector;

public class MainArray {
    public static void main(String[] args) {
        System.out.println("---------------Adapter pattern----------------");
        Vector<Double> classicVector = new Vector<Double>();
        classicVector.add(10.8);
        classicVector.add(20.1);
        classicVector.add(50.9);
        System.out.println("Original class is " + classicVector.getClass());
        System.out.println("Classic Vector " + classicVector);

        VectorAdapter convertedVector = Vectors.getAdaptedJVector(classicVector);
        System.out.println("Converted class is " + convertedVector.getClass());
        System.out.println("Converted Vector " + convertedVector);

        System.out.println("---------------Protected class----------------");
        VectorAdapter jLinkedvectorNonProtected = new JLinkedListVector();
        jLinkedvectorNonProtected.setVectorFromArray(Vectors.randomVector(6));
        System.out.println("Original vector  : " + jLinkedvectorNonProtected);
        System.out.println("Vector size      : " + jLinkedvectorNonProtected.countVectorLength());

        VectorAdapter protectedJLinkedVector = Vectors.getProtectedVector(jLinkedvectorNonProtected);
        protectedJLinkedVector.setVectorFromArray(Vectors.randomVector(7));
        System.out.println("Protected vector : " + protectedJLinkedVector);
        System.out.println("Vector size      : " + protectedJLinkedVector.countVectorLength());
    }
}
