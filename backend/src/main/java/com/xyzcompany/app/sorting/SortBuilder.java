package com.xyzcompany.app.sorting;

import com.xyzcompany.app.constants.CommonConstants;

/**
 * This class creates instances based on the sort type
 * 
 * @author Vimal
 *
 */

public class SortBuilder {

	public static Sorting getInstance(String type) {

		switch (type) {
		case CommonConstants.MERGE:
			return new MergeSorting();
		}

		return null;
	}

}
