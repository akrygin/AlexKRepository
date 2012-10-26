package oldVectorsLab2;

/**
 * Debug class
 * @author Krygin
 * @version 1.0
 */
public class MainArray {
	public static void main(String[] args) {
		
		/* 
		 * Initialize arrays
		 */
		double[] arr1 = { 7, 14, 8, 9, 6, 5 };
		double[] arr2 = { 7, 14, 8, 10, 6, 5 };
		
		/* 
		 * Creation vector's objects 
		 */
		MyArray a1 = new MyArray(6);
		MyArray a2 = new MyArray(6);
		MyArray a3 = new MyArray(6);
		
		/* 
		 * Initialize vectors
		 */
		a1.setArrs(arr1);
		a2.setArrs(arr2);
		System.out.println("-Vector init by an vector--");
		
		/* 
		 * Initialize vector by another vector
		 */
		a3.setVec(a1);
		for (int i = 0; i < a3.countEl(); i++) {
			System.out.println("Element value : " + a3.getElem(i));
		}
		System.out.println(" ");
		System.out.println("----Vectors Scal Mult------");
		
		MyArray.arrScalMult(a1, a2);
		System.out.println(" ");
		System.out.println("----Vectors comparison------");
		
		/* 
		 * Comparison of two vectors
		 */
		MyArray.arrEquels(a1, a2);
		System.out.println(" ");
		System.out.println("---Vector with new element--");
				
		/* 
		 * Set element of vector 3 to 2.0 value 
		 */
		a1.setElem(3, 2);
		for (int i = 0; i < a1.countEl(); i++) {
			System.out.println("Element value : " + a1.getElem(i));
		}
		System.out.println(" ");
		System.out.println("-------Vector length--------");

		/* 
		 * Vector length 
		 */
		System.out.println("Vector length : " + a1.countEl() + " elements");
		System.out.println(" ");
		System.out.println("---Get element of vector----");

		/* 
		 * Get element of array 
		 */
		System.out.println("Element value is " + a1.getElem(3));
		System.out.println(" ");
		System.out.println("---Maximum value of vector--");

		/* 
		 * Maximal value of vector 
		 */
		System.out.println("The maximum element is " + a1.arrMax());
		System.out.println(" ");
		System.out.println("---Minimum value of vector--");

		/* 
		 * Minimal value of vector 
		 */
		System.out.println("The minimum element is " + a1.arrMin());
		System.out.println(" ");
		System.out.println("---Vector's multiplication--");

		/* 
		 * Multiplication array by value 
		 */
		a1.arrMult(5);
		for (int i = 0; i < a1.countEl(); i++) {
			System.out.println("Multiplication element value : " + a1.getElem(i));
		}
		System.out.println(" ");
		System.out.println("---Addition of two vectors--");
		
		/* 
		 * Addition of two vectors
		 */
		a3.arrAddition(a1, a2);
		for (int i = 0; i < a3.countEl(); i++) {
			System.out.println("Additional element value : " + a3.getElem(i));
		}
		System.out.println(" ");
		System.out.println("-------Sorting vector------");
				
		/* 
		 * Sort vector a3 by static class
		 */
		Sort.arrSort(a3);
		for (int i = 0; i < a3.countEl(); i++) {
			System.out.println("Sorted element value : " + a3.getElem(i));
		}
	}
}
