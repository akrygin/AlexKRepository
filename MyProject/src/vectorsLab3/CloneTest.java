package vectorsLab3;

/**
 * Debug class
 * @author Krygin
 * @version 1.0
 */
public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Initialize values for the list
		 */
		double one = 56;
		double two = 9;
		double three = 10;
		double four = 17;
		double[] arr1 = { 7, 14, 8, 9, 6, 5 };
		double[] arr2 = { 7, 14, 8, 10, 6, 5 };
		
		/*
		 * Clone test
		 * Vector clone test
		 */
		ArrayVector or = new ArrayVector(6);
		or.setVectorFromArray(arr1);
		System.out.println(or);
		ArrayVector cl = or.clone();
		cl.setVectorFromArray(arr2);
		System.out.println(cl);
		System.out.println(or);

		/*
		 * List clone test
		 */
		System.out.println("");
		LinkedListVector o = new LinkedListVector();
		o.addElementOfVector(four);
		o.addElementOfVector(two);
		o.addElementOfVector(one);
		System.out.println("");
		for (int i = 0; i < o.countVectorLength(); i++) {
			System.out.println("Element value : " + o.getElementOfVector(i));
		}
		System.out.println("Original object - " + o);
		System.out.println("Length of original object - " + o.countVectorLength());
		LinkedListVector c = o.clone();
		c.addElementOfVector(three);
		c.setElementOfVector(2, two);
		c.removeElementOfVectorByIndex(2);
		c.addElementOfVector(four);
		System.out.println("Cloned object = " + c);
		System.out.println("Length of cloned object - " + c.countVectorLength());
		System.out.println("Original object - " + o);
		System.out.println("Length of original object - " + o.countVectorLength());
	}
}
