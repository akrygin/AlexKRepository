package sVectorsLab5;

import java.io.*;

public class MainArray {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayVector a = new ArrayVector(6);
		a.setVectorFromArray(Vectors.randomVector(6));
		System.out.println(a.toString());
		
		System.out.println("----------------Binary IO-------------------");
		Vectors.outputVector(a, new FileOutputStream("out.bin"));	
		Vectors.inputVector(new FileInputStream("out.bin"));
		
		System.out.println("----------------String IO-------------------");
		Vectors.writeVector(a, new FileWriter("out.txt"));
		Vectors.readVector(new FileReader("out.txt"));
        System.out.println("SDGS");
	}
}
