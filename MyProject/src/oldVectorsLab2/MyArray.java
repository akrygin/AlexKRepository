package oldVectorsLab2;

/**
 * Class for operations with arrays
 * 
 * @author Krygin A.N.
 * @version 1.0
 */
public class MyArray {
	private double[] arrs; 

	/**
	  * Constructor 
	  * @param v - takes vector's length
	  */
	public MyArray(int v) {
		this.arrs = new double[v];
	}

	/** 
	 * Method for getting single element of vector
	 * @param i - get element value
	 * @return this.arrs[i] - element of vector 
	 */
	public double getElem(int i) {
		return this.arrs[i];
	}

	/**
	 * Method for setting element of vector
	 * @param i - length of vector
	 * @param k - element of vector
	 * @return void
	 */
	public void setElem(int i, double k) {
		this.arrs[i] = k;
	}

	/**
	  * Method for setting full vector from array
	  * @param arrs - input array
	  * @return void
	  */
	public void setArrs(double[] arrs) {
		if (this.countEl() != arrs.length) {
			System.out.println("Array and vector aren't same in length ! Filling is dinied");
			return;
		}
		for (int i = 0; i < arrs.length; i++) {
			this.setElem(i, arrs[i]);
		}
	}

	/**
	 * Method for setting full vector from another vector
	 * @param arrs - input vector
	 * @return void
	 */
	public void setVec(MyArray arrs) {
		for (int i = 0; i < this.countEl(); i++) {
			this.setElem(i, arrs.getElem(i));
		}
	}
	
	/**
	 * Method for determine the length
	 * @return count - value of vector length
	 */
	public int countEl() {
		int count = 0;
		for (int i = 0; i < this.arrs.length; i++)
			count++;
		return count;
	}
	
	/**
	 * Method for determine maximum value of vector
	 * @return max - maximum value of vector
	 */
	public double arrMax() {
		double max = 0;
		for (int i = 0; i < this.arrs.length; i++)
			if (max < this.arrs[i])
				max = this.arrs[i];
		return max;
	}

	/**
	 * Method for determine minimum value of vector
	 * @return min - minimum value of vector
	 */
	public double arrMin() {
		double min = this.getElem(0);
		for (int i = 0; i < this.arrs.length; i++)
			if (min > this.arrs[i])
				min = this.arrs[i];
		return min;
	}
	
	/**
	 * Method for multiplication vector by value
	 * @param m - factor for multiplication
	 * @return void
	 */
	public void arrMult(double m) {
		for (int i = 0; i < countEl(); i++) {
			this.setElem(i, this.getElem(i) * m);
		}
	}
	
	/**
	 * Method for addition two vectors
	 * @param arr1 - first foldable vector
	 * @param arr2 - second foldable vector
	 * @return void
	 */
	public void arrAddition(MyArray arr1, MyArray arr2) {
		for (int i = 0; i < this.countEl(); i++) {
			double summ = arr1.getElem(i) + arr2.getElem(i);
			this.setElem(i, summ);
		}
	}
	
	/**
	 * Method for scalar multiplication two vectors
	 * @param arr1 - first multiplication vector
	 * @param arr2 - second multiplication vector
	 * @return void
	 */
	public static void arrScalMult(MyArray arr1, MyArray arr2) {
		double scalmult = 0;
		for (int i = 0; i < arr1.countEl(); i++)
			scalmult += arr1.getElem(i) * arr2.getElem(i);
		System.out.println("Scalar multiplication vectors = " + scalmult);
	}

	/**
	 * Method for comparison two vectors. If length of vectors same method compare elements
	 * but if length of vectors different, comparison stops. 
	 * @param arr1 - first comparison vector
	 * @param arr2 - second comparison vector
	 * @return void
	 */
	public static void arrEquels(MyArray arr1, MyArray arr2) {
		if (arr1.countEl() != arr2.countEl()) {
			System.out.println("Vectors aren't same in lenght");
		}
		for (int i = 0; i < arr1.countEl(); i++)
			if (arr1.countEl() == arr2.countEl())
				if (arr1.getElem(i) != arr2.getElem(i)) {
					System.out.println("Elements at " + i + " is different, vectors aren't same");
				} else {
					System.out.println("Elements at " + i + " are same");
				}
	}
}
