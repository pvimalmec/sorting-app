package com.xyzcompany.app.util;

/**
 * Utililty class
 * @author vimal
 *
 */

public class SortUtils {

	public static Integer[] swapNumbers(Integer[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}

}
