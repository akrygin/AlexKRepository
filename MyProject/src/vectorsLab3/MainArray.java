package vectorsLab3;

/**
 * Debug class
 * @author Krygin
 * @version 1.0
 */
public class MainArray {
	public static void main(String[] args) throws CloneNotSupportedException {

		/*
		 * Initialize arrays
		 */
		double[] arr1 = { 7, 14, 8, 9, 6, 5 };
		double[] arr2 = { 7, 14, 8, 10, 6, 5 };

		/*
		 * Creation objects of vectors
		 */
		ArrayVector a1 = new ArrayVector(6);
		ArrayVector a2 = new ArrayVector(6);
		ArrayVector a3 = new ArrayVector(6);
		System.out.println("------------------------");
		System.out.println("------Vectors Test------");
		System.out.println("------------------------");
		System.out.println(" ");

		/*
		 * Initialize vectors
		 */
		a1.setVectorFromArray(arr1);
		a2.setVectorFromArray(arr2);
		
		System.out.println(a1.toString());
		System.out.println(" ");
		System.out.println("-Vector inint by an vector--");
		
		/*
		 * Initialize vector by another vector
		 */
		a3.setVectorFromVector(a1);
		for (int i = 0; i < a3.countVectorLength(); i++) {
			System.out.println("Element value : " + a3.getElementOfVector(i));
		}
		System.out.println(" ");
		System.out.println("---Vector with new element--");
		System.out.println("Test hash code vector a1 - " + a1.hashCode());
		System.out.println("Test hash code vector a3 - " + a3.hashCode());
				
		/* 
		 * Set element of vector 3 to 2.0 value 
		 */
		a1.setElementOfVector(3, 2);
		for (int i = 0; i < a1.countVectorLength(); i++) {
			System.out.println("Element value : " + a1.getElementOfVector(i));
		}
		System.out.println(" ");
		System.out.println("-------Vector length--------");

		/* 
		 * Vector length 
		 */
		System.out.println("Vector length : " + a1.countVectorLength() + " elements");
		System.out.println(" ");
		System.out.println("---Get element of vector----");

		/* 
		 * Get element of array 
		 */
		System.out.println("Element value is " + a1.getElementOfVector(3));
		System.out.println(" ");
		System.out.println("------------------------");
		System.out.println("---Linked List Test-----");
		System.out.println("------------------------");

		/*
		 * Initialize values for the list
		 */
		double one = 56;
		double two = 9;
		double three = 10;
		double four = 17;

		/*
		 * Creation objects of list
		 */
		LinkedListVector a = new LinkedListVector();
		a.addElementOfVector(one);
		a.addElementOfVector(two);
		a.addElementOfVector(three);
		System.out.println("");
		System.out.println("---First Linked List (with toString method)----");

		/*
		 * Demonstration of Linked List
		 * also test toString method
		 */
		System.out.println(a.toString());
		System.out.println("Vector size is : " + a.countVectorLength());
		System.out.println("");
		System.out.println("---Add Elem to Linked List (in position 2)----");

		/*
		 * Add element to list in position 2 (0.....n)
		 */
		a.addElementOfVectorByIndex(2, one);
		for (int i = 0; i < a.countVectorLength(); i++) {
			System.out.println("Element value : " + a.getElementOfVector(i));
		}
		System.out.println("Vector size is : " + a.countVectorLength());
		System.out.println("");
		System.out.println("---Remove Elem from the Linked List (in position 0)----");

		/*
		 * Remove element from the list in position 0 (0.....n)
		 */
		a.removeElementOfVectorByIndex(0);
		for (int i = 0; i < a.countVectorLength(); i++) {
			System.out.println("Element value : " + a.getElementOfVector(i));
		}
		System.out.println("Vector size is : " + a.countVectorLength());
		System.out.println("");
		System.out.println("---Set Elem to the Linked List (in position 2)----");

		/*
		 * Set element to the list in position 2 (0.....n)
		 */
		a.setElementOfVector(2, four);
		for (int i = 0; i < a.countVectorLength(); i++) {
			System.out.println("Element value : " + a.getElementOfVector(i));
		}
		System.out.println("Vector size is : " + a.countVectorLength());
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("-----Interface test-----");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("-Multiplication linked list by scalar-");
		
		
		/*
		 * Multiplication linked list by scalar
		 */
		Vectors.arrMult(two, a);
		for (int i = 0; i < a.countVectorLength(); i++) {
			System.out.println("Element value : " + a.getElementOfVector(i));
		}
		System.out.println("");
		System.out.println("-Multiplication vector by scalar-");
		
		/*
		 * Multiplication vector by scalar
		 */
		Vectors.arrMult(two, a1);
		for (int i = 0; i < a1.countVectorLength(); i++) {
			System.out.println("Element value : " + a1.getElementOfVector(i));
		}
		System.out.println("");
		System.out.println("-Scalar multiplication vector and linked list-");
		
		/*
		 * Scalar multiplication vector and linked list
		 */
		Vectors.arrScalMult(a, a1);
		System.out.println("");
		System.out.println("-Comparison vector and linked list-");
		
		/*
		 * Comparison vector and linked list
		 */
		Vectors.arrEquels(a, a1); 
		
		/*
		 * Equals and hash code test
		 */
		System.out.println("");
		System.out.println("------Equals test-------");
		System.out.println("Test equals method between vactor a1 and list a - " + a.equals(a1));
		System.out.println("Test equals method between vector a1 and vector a1 - " + a1.equals(a1));
		System.out.println("");
		System.out.println("------Hash Code test-------");
		System.out.println("Test hash code list   - " + a.hashCode());
		System.out.println("Test hash code vector - " + a1.hashCode());
		System.out.println("Test hash code vector - " + a2.hashCode());
		System.out.println("Test hash code vector - " + a3.hashCode());
	}
}
