package com.xyzcompany.app.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyzcompany.app.bo.SortBO;
import com.xyzcompany.app.persistence.entity.Sort;
import com.xyzcompany.app.service.HistoryService;
import com.xyzcompany.app.service.SortingEngineService;

/**
 * Controller for Rest api service calls
 * @author vimal
 *
 */

@CrossOrigin
@RestController
public class SortController {

	@Autowired
	HistoryService service;

	@RequestMapping(method = RequestMethod.GET, path = "/randomnumbers")
	public Object getRandomNumbers() {

		Random rand = new Random();

		List<Integer> randomno = new ArrayList<Integer>();

		for (int i = 0; i <= 9; i++) {
			randomno.add(rand.nextInt(50));
		}

		return randomno;
	}

	@PostMapping(path = "/sort", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object getsortedNumber(@RequestBody SortBO sortbo) {

		SortingEngineService engine = new SortingEngineService();

		sortbo = engine.executeSort("MERGE", sortbo);

		service.saveHistory(sortbo);

		return sortbo;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/history")
	public Object retrieveHistory() {

		List<Sort> sortedItems = service.retrieveHistory();

		return sortedItems;

	}

}
