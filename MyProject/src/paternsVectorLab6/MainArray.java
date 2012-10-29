package paternsVectorLab6;

public class MainArray {
    public static void main(String[] args) {
        ArrayCreator c = new ArrayCreator();
        Vectors.setVectorFactory(c);
        ArrayVector b = (ArrayVector)Vectors.createInstance(6);
        b.setVectorFromArray(Vectors.randomVector(6));
        System.out.println(b);
    }
}
