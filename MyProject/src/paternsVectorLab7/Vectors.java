package paternsVectorLab7;

import java.io.*;
import java.math.BigDecimal;
import java.util.Random;

/**
 * Static class for arithmetic operations with vectors
 * @author Krygin
 * @version 1.0
 */
public class Vectors {
	
	/* WRITE */
	public static void writeVector(sVectorsLab5.Vector arrs, Writer out) {
		try {
			PrintWriter write = new PrintWriter(out);
			for (int i = 0; i < arrs.countVectorLength(); i++) {
				write.println(arrs.getElementOfVector(i));
			}
			out.close();
		} catch (IOException e) {
			System.out.println("Some error occurred!");
		}
	}

	/* READ */
	public static void readVector(Reader in) {
		try {
			BufferedReader read = new BufferedReader(in);
			StreamTokenizer tokenizer = new StreamTokenizer(read);
			while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
				if(tokenizer.ttype == StreamTokenizer.TT_WORD) {
			        System.out.println(tokenizer.sval);
			    } else if(tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
			        System.out.println(tokenizer.nval);
			    } else if(tokenizer.ttype == StreamTokenizer.TT_EOL) {
			        System.out.println();
			    }
			}
			read.close();
		} catch (IOException e) {
			System.out.println("Some error occurred!");
		}
	}
//-------------------------------------------------------------------------------------------------------
	/* OUTPUT (write) */
	public static void outputVector(sVectorsLab5.Vector arrs, OutputStream out) {
		try {
			DataOutputStream write = new DataOutputStream(out);
			write.writeInt(arrs.countVectorLength());
			for (int i = 0; i < arrs.countVectorLength(); i++) {
				write.writeDouble(arrs.getElementOfVector(i));
			}
			out.close();
		} catch (IOException e) {
			System.out.println("Some error occurred!");
		}
	}

	/* INPUT (read) */
	public static void inputVector(InputStream in) {
		try {
			DataInputStream read = new DataInputStream(in);
			int a = read.readInt();
			double[] values = new double[a];
			for (int i = 0; i < a; i++) {
				values[i] = read.readDouble();
				System.out.println(values[i]);
			}
			read.close();
		} catch (IOException e) {
			System.out.println("Some error occurred!");
		}
	}
//-------------------------------------------------------------------------------------------------------------------
	/**
	 * Method for multiplication vector by value
	 * @param m - factor for multiplication
	 * @return void
	 */
	public static void arrMult(double m, sVectorsLab5.Vector arrs) {
		for (int i = 0; i < arrs.countVectorLength(); i++) {
			arrs.setElementOfVector(i, arrs.getElementOfVector(i)*m);
		}
	}

	/**
	 * Method for addition two vectors
	 * @param arr1 - first foldable vector
	 * @param arr2 - second foldable vector
	 * @return void
	 */
	public static void arrAddition(sVectorsLab5.Vector arr1, sVectorsLab5.Vector arr2) {
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
	public static void arrScalMult(sVectorsLab5.Vector arr1, sVectorsLab5.Vector arr2) {
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
	public static void arrEquels(sVectorsLab5.Vector arr1, sVectorsLab5.Vector arr2) {
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
