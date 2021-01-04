/**
 * 
 */
package com.alok;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * @author Alok Soni
 *
 */
class MyTestCases {
	
	private MaximizePresentersAlgo _mMaximizePresentersAlgo = null;

	List<String[]> columnValues = new ArrayList<String[]>();
	
	@BeforeEach
	public void setUp() {
		_mMaximizePresentersAlgo = new MaximizePresentersAlgo();
	}

	@Test
	void test() {
		assertTrue(true);
	}

	
	@Test
    void isFileExist() throws IOException{		
		boolean isExist = _mMaximizePresentersAlgo.isFileExist();
		assertTrue(isExist);				
    }
	
	@Test
	void readPresentationFile() {	
		List<Presentation> list = _mMaximizePresentersAlgo.readPresentationFile();
		assertTrue(list.size() > 0);		
	}

	@Test
	void getNumberOfSessions() {
		List<Presentation> list = new ArrayList<>();
		List<Presentation> result = _mMaximizePresentersAlgo.getNumberOfSessions(8, list);
		assertEquals(0, result.size());
		
		list.add(new Presentation("P1", 3, 100));
		list.add(new Presentation("P2", 1, 200));
		list.add(new Presentation("P3", 2, 50));
		list.add(new Presentation("P4", 3, 80));
		List<Presentation> result2 = _mMaximizePresentersAlgo.getNumberOfSessions(6, list);
		
		assertTrue(result2.size() == 3);
	}

}
