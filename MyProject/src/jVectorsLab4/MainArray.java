package jVectorsLab4;

import java.math.*;
import java.util.*;

public class MainArray {
	public static void main(String[] args){
		Double[] arr1 = { 100.0, 25.0, 8.0, 54.0, 6.0, 5.0 };
		Double[] arr3 = { 100.0, 20.0, 8.0, 54.0, 6.0, 5.0 };
		JArrayListVector a = new JArrayListVector(arr1);
		JLinkedListVector b = new JLinkedListVector(arr3);
//		System.out.println(a.getArrayVector());
//		System.out.println("Vector a size : " + a.countVectorLength());
//		System.out.println(b.getLinkedVector());
//		System.out.println("Vector b size : " + b.countVectorLength());
		//a.setVectorFromArray(Vectors.randomVector(7));
		System.out.println(a.getArrayVector());
		System.out.println("Vector a size : " + a.countVectorLength());	
		System.out.println(b.getLinkedVector());
		System.out.println("Vector b size : " + b.countVectorLength());
		ArrayVector a2 = new ArrayVector(6);
		a2.setVectorFromArray(Vectors.randomVector(6));
		LinkedListVector b2 = new LinkedListVector();
		b2.setVectorFromArray(Vectors.randomVector(6));
		for (double el : a2) {
			System.out.println(el);
		}
		for (double el2 : b){
			System.out.println(el2);
		}
	}
}
