package paternsVectorLab6;

public class MainArray {
    public static void main(String[] args) {
        Vectors.setVectorFactory(new ArrayCreator());
        Vector b = Vectors.createInstance(6);
        b.setVectorFromArray(Vectors.randomVector(6));
        System.out.println(b);
    }
}

