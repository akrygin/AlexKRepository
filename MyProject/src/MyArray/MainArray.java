package MyArray;

public class MainArray {
	public static void main(String[] args) {
		float[] m = { 67, 4, 8, 9, 56, 90 };
		MyArray a = new MyArray(6);
		a.setArrs(m);
		float[] b = a.getArrs();
		for (int i = 0; i < b.length; i++) {
			System.out.println("Element value : " + b[i]);
		}
		int l = a.countEl();
		System.out.println("Array lenght : " + l + " elements");
		/*a.arrSort();
		float[] c = a.getArrs();
		for (int i = 0; i < c.length; i++) {
			System.out.println("Element value : " + c[i]);
		}*/
		a.getArrs();
		int max = a.arrMax();
		System.out.println(max);
	}
}
