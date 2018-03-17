package com.bridgeit.programs;

import java.util.*;

public class SetMapDemo {
	public static void main(String[] args) {
		Integer[] data = { 34, 56, 12, 77, 89, 90 };

		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		int j = 0;
		for (j = 0; j < data.length; j++) {

			m.put(j, data[j]);

		}

		System.out.println("Hash map: " + m);

	}

}
