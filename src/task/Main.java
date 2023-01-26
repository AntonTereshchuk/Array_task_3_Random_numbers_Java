package task;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int[] array1 = new int[15];
		int[] array2;
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rn.nextInt(25);
		}
		
		array2 = Arrays.copyOf(array1, 30);
		
		System.out.println("Array 1: " + Arrays.toString(array1));
		
		for (int i = 0; i < array2.length; i++) {
			if (i > array1.length - 1) {
				array2[i] = array1[i - array1.length] * 2;
			}
		}
		
		System.out.println("Array 2: " + Arrays.toString(array2));
		
	}

}
