package vectorsLab3;

public class MainArray1 {
	public static void main(String[] args){
		double[] arr1 = { 7, 14, 8, 9, 6, 5 };
		ArrayVector a1 = new ArrayVector(6);
		LinkedListVector a = new LinkedListVector();
		LinkedListVector b = new LinkedListVector();
		LinkedListVector c = new LinkedListVector();
		a1.setVectorFromArray(arr1);
		a.setVectorFromArray(arr1);
		b.setVectorFromArray(arr1);
		c.setVectorFromVector(a);
		System.out.println("Linked list Vector a  - " + a);
		System.out.println("Linked list Vector b  - " + b);
		System.out.println("Linked list Vector c  - " + c);
		System.out.println("Linked list Vector a1 - " + a1);
		System.out.println("");
		System.out.println("Test equals method between vactor a1 and list a    - " + a.equals(b));
		System.out.println("Test equals method between vactor a1 and list a    - " + c.equals(b));
		System.out.println("Test equals method between vector a1 and vector a1 - " + a1.equals(a1));
		System.out.println("");
		System.out.println("Test hash code list a - " + a.hashCode());
		System.out.println("Test hash code list b - " + b.hashCode());
		System.out.println("Test hash code list c - " + c.hashCode());
		System.out.println("Test hash code vector - " + a1.hashCode());
	}
}
