package com.xyzcompany.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyzcompany.app.bo.SortBO;
import com.xyzcompany.app.persistence.entity.Sort;
import com.xyzcompany.app.persistence.repository.ModelJpaRepository;

/**
 * HistoryService class to get history of sorted numbers
 * @author vimal
 *
 */

@Service
public class HistoryService {

	@Autowired
	private ModelJpaRepository modelJpaRepository;

	public List<Sort> retrieveHistory() {

		List<Sort> sorteditems = modelJpaRepository.findAll();

		return sorteditems;
	}

	public Sort saveHistory(SortBO sortbo) {

		Sort sort = maptoEntity(sortbo);

		modelJpaRepository.save(sort);

		return sort;

	}

	private Sort maptoEntity(SortBO sortbo) {

		Sort sort = new Sort();

		sort.setOrderednumbers(listToString(sortbo.getOrderedlist()));

		sort.setUnorderednumbers(sortbo.getUnOrdereditems());

		sort.setPositions(sortbo.getPositionchanged());

		return sort;
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
