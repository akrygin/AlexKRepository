package oldVectorsLab2;

public class Test {
	public static void main(String[] args) {
		int array1[] = { 1, 4, 5, 1, 9 };
		int array2[] = { 1, 6, 5, 1, 0 };
		int scalmult = 0;
		for (int i = 0; i < array1.length; i++)
				scalmult += array1[i] * array2[i];
		System.out.println("Scalar multiplication vectors = " + scalmult);
	}
}
