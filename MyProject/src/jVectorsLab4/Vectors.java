package jVectorsLab4;

import java.math.*;
import java.util.*;


import vectorsLab3.Vector;

/**
 * Static class for arithmetic operations with vectors
 * @author Krygin
 * @version 1.0
 */
public class Vectors {
	
	/**
	 * Method for multiplication vector by value
	 * @param m - factor for multiplication
	 * @return void
	 */
	public static void arrMult(double m, Vector arrs) {
		for (int i = 0; i < arrs.countVectorLength(); i++) {
			arrs.setElementOfVector(i, arrs.getElementOfVector(i) * m);
		}
	}
	
	/**
	 * Method for addition two vectors
	 * @param arr1 - first foldable vector
	 * @param arr2 - second foldable vector
	 * @return void
	 */
	public static void arrAddition(Vector arr1, Vector arr2) {
		for (int i = 0; i < arr1.countVectorLength(); i++) {
			double summ = arr1.getElementOfVector(i) + arr2.getElementOfVector(i);
			System.out.println("Adition elements : " + summ);
		}
	}
	
	/**
	 * Method for scalar multiplication two vectors
	 * @param arr1 - first multiplication vector
	 * @param arr2 - second multiplication vector
	 * @return void
	 */
	public static void arrScalMult(Vector arr1, Vector arr2) {
		double scalmult = 0;
		for (int i = 0; i < arr1.countVectorLength(); i++)
			scalmult += arr1.getElementOfVector(i) * arr2.getElementOfVector(i);
		System.out.println("Scalar multiplication vectors = " + scalmult);
	}

	/**
	 * Method for comparison two vectors. If length of vectors same method compare elements
	 * but if length of vectors different, comparison stops. 
	 * @param arr1 - first comparison vector
	 * @param arr2 - second comparison vector
	 * @return void
	 */
	public static void arrEquels(Vector arr1, Vector arr2) {
		if (arr1.countVectorLength() != arr2.countVectorLength()) {
			System.out.println("Vectors aren't same in lenght");
		}
		for (int i = 0; i < arr1.countVectorLength(); i++)
			if (arr1.countVectorLength() == arr2.countVectorLength())
				if (arr1.getElementOfVector(i) != arr2.getElementOfVector(i)) {
					System.out.println("Elements at " + i + " is different, vectors aren't same");

				} else {
					System.out.println("Elements at " + i + " are same");
				}
	}
	public static double[] randomVector(int lengthOfRandomVector){
		Random randomVectorObj = new Random();
		double[] randomArray = new double[lengthOfRandomVector];
		double[] roundRandomArray = new double[lengthOfRandomVector];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = randomVectorObj.nextDouble()*10;

			/* Using ROUND_HALF_UP of BigDecimal class 
			 * for rounding result of random generating array 
			 * to 3 values after comma */
			BigDecimal bigDecimal = new BigDecimal(randomArray[i]);
			bigDecimal = bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP);
			for (int j = 0; j < randomArray.length; j++){
				roundRandomArray[i] = bigDecimal.doubleValue();
			}
		}
		return roundRandomArray;
	}
}
