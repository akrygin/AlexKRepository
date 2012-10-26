package sVectorsLab5;

import java.io.*;

/**
 * Test serialization
 * @author Admin
 * @version 1.0
 */
public class MainSerial {
	public static void main(String[] args) {
		File file = new File("serialaize.out");

        /*
        Serialisation test
         */
		System.out.println("---------------------------OUTPUT-----------------------------");
		FileOutputStream outputFileStream = null;
		ObjectOutputStream outputObjectStream = null;
		Vector outputClassObjectLinkedList;
		Vector outputClassObjectArray;
		try {
			outputFileStream = new FileOutputStream(file);
			outputObjectStream = new ObjectOutputStream(outputFileStream);
			outputClassObjectLinkedList = new LinkedListVector();
			outputClassObjectArray = new ArrayVector(6);
			outputClassObjectLinkedList.setVectorFromArray(Vectors.randomVector(6));
			outputClassObjectArray.setVectorFromArray(Vectors.randomVector(6));
			System.out.println(outputClassObjectArray.toString());
			System.out.println(outputClassObjectLinkedList.toString());
			outputObjectStream.writeObject(outputClassObjectLinkedList);
			outputObjectStream.writeObject(outputClassObjectArray);
		} catch (FileNotFoundException e) {
			System.out.println("Can not find file: " + file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input/Output error: " + e.toString());
			e.printStackTrace();
		} finally {
			try {
				if (outputObjectStream != null) {
					outputObjectStream.close();
				}
			} catch (IOException e) {
			}
			try {
				if (outputFileStream != null) {
					outputFileStream.close();
				}
			} catch (IOException e) {
			}
		}

		System.out.println("");
		System.out.println("---------------------------INPUT------------------------------");
		FileInputStream inputFileStream = null;
		ObjectInputStream inputObjectStream = null;
		Vector inputClassObjectLinkedList;
		Vector inputClassObjectArray;
		try {
			inputFileStream = new FileInputStream(file);
			inputObjectStream = new ObjectInputStream(inputFileStream);
			inputClassObjectLinkedList = (LinkedListVector) inputObjectStream.readObject();
			inputClassObjectArray = (ArrayVector) inputObjectStream.readObject();
			System.out.println(inputClassObjectArray.toString());
			System.out.println(inputClassObjectLinkedList.toString());
		} catch (FileNotFoundException e) {
			System.out.println("Can not find file: " + file);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input/Output error: " + e.toString());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class foundation error: " + e.toString());
			e.printStackTrace();
		} finally {
			try {
				if (inputFileStream != null) {
					inputFileStream.close();
				}
			} catch (IOException e) {
			}
			try {
				if (inputFileStream != null) {
					inputFileStream.close();
				}
			} catch (IOException e) {
			} 
		}
	}
}
