package com.xyzcompany.sortingapp.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import com.xyzcompany.app.bo.SortBO;
import com.xyzcompany.app.service.SortingEngineService;

/**
 * This class is to test SortingEngineServiceTest
 * @author vimal
 *
 */

@RunWith(JUnitPlatform.class)
public class SortinEngineTest {
	
	SortingEngineService service;
	
	@BeforeEach
	public void init(){
		service  = new SortingEngineService();
	}
	
	@Test
	public void testExecuteSortForUnorderedNumbers(){
		
		SortBO sortBO = service.executeSort("MERGE", stubUnorderedNumberSortBO());
		
		assertNotNull(sortBO);
		
		assertEquals(new Integer(5), new Integer(sortBO.getOrderedlist().length));
		
		//0th element of array should be 1 as it is the least number in the array
		
		assertEquals(new Integer(1), sortBO.getOrderedlist()[0]);
	}
	
	@Test
	public void testExecuteSortForOrderedNumbers(){
		
		SortBO sortBO = service.executeSort("MERGE", stubOrderedNumberSortBO());
		
		assertNotNull(sortBO);
		
		assertEquals(new Integer(6), new Integer(sortBO.getOrderedlist().length));
		
		//6th element of array should be 7 as it is the last number in the array
		
		assertEquals(new Integer(7), sortBO.getOrderedlist()[5]);
	}
	
	@Test
	public void testExecuteSortForEmptyList(){
		
		SortBO sortBO = service.executeSort("MERGE", new SortBO());
		
		assertNotNull(sortBO);
		
		//0 should be returned as no element available in the un ordered arsay
		
		assertEquals(new Integer(0), new Integer(sortBO.getOrderedlist().length));
		
	}
	
	
	
	
	public SortBO stubUnorderedNumberSortBO(){
		
		SortBO sortbo = new SortBO();
		
		Integer[] unorder = {5, 2, 12, 7,1};
		
		sortbo.setUnorderedList(unorder);
		
		return sortbo;
	}
	
	
	public SortBO stubOrderedNumberSortBO(){
		
		SortBO sortbo = new SortBO();
		
		Integer[] order = {1,2,3,4,6,7};
		
		sortbo.setUnorderedList(order);
		
		return sortbo;
	}

}
