package com.xyzcompany.sortingapp.unit;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import com.xyzcompany.app.api.controller.SortController;

/**
 * This class is to test SortController
 * @author vimal
 *
 */

@RunWith(JUnitPlatform.class)
public class SortControllerTest {
	
	SortController controller = null;
	
	@BeforeEach
	public void init(){
		controller = new SortController();
	}
	
	@Test
	public void testRandomNumbers(){
		
		List<Integer> numbers = (List<Integer>) controller.getRandomNumbers();
		
		assertNotNull(numbers);
		
		//we are validating whether list of numbers returned in the method is 10
		assertEquals(new Integer(10), new Integer(numbers.size()));		
		
	}
	
	@Test
	public void testRandomNumbers_wrongreturnType() throws Exception{
		
		//Class cast exception is expected as returned integer arraylist is casted to String arraylist
		
		Assertions.assertThrows(ClassCastException.class, () ->{
			List<String> numbers = (List<String>) controller.getRandomNumbers();
			
			for(String nu: numbers){
				System.out.println(nu);
			}
		});
		
	}

}
