package com.xyzcompany.app.service;

import com.xyzcompany.app.bo.SortBO;
import com.xyzcompany.app.sorting.SortBuilder;
import com.xyzcompany.app.sorting.Sorting;

/**
 * SortingEngineService class to execute sort
 * @author vimal
 *
 */

public class SortingEngineService {

	private Sorting sort;

	/**
	 * Choose the sorting type to verify the performance between the sorting
	 * 
	 * @param type
	 */
	public SortBO executeSort(String type, SortBO sortbo) {

		sort = SortBuilder.getInstance(type);

		if (sortbo.getUnorderedList().length > 0) {

			sortbo.setUnOrdereditems(listToString(sortbo.getUnorderedList()));

			Integer[] list = sort.executeSort(sortbo.getUnorderedList());

			sortbo.setOrderedlist(list);

			sortbo.setPositionchanged(sort.totalpositionchanges());

		}

		return sortbo;

	}

	public String listToString(Integer[] numbers) {

		StringBuilder builder = new StringBuilder();
		
		/* Java 8 forEach loop cannot be used since we are using IntegerArray not arraylist */
		
		for (Integer number : numbers) {
			builder.append(number + ", ");
		}

		String finOutput = builder.toString().trim();
		return finOutput.substring(0, finOutput.length() - 1);

	}

}
