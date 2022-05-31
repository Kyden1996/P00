import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Tang Kee Kong
 * Student ID: 21030068
 * Class: W64N
 * Date/Time created: Tuesday 31-05-2022 11:18
 */

/**
 * @author 21030068
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddN() {
		int a = 4321;
		int b = 1234;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,b);
			
			int expected = 5555;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testAddBMax() {
		int a = 9999;
		int b = 9999;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,b);
			
			int expected = 19998;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testAddBMin() {
		int a = 0;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,b);
			
			int expected = 0;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testAddError() {
		int a = -1;
		int b = 9999;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a,b);
			
			String expected = "Error!";
			assertNotEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a,b);
			
			int expected = 3087;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractBMax() {
		int a = 9999;
		int b = 0000;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a,b);
			
			int expected = 9999;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractBMin() {
		int a = 0000;
		int b = 0000;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a,b);
			
			int expected = 0;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractError() {
		int a = -1;
		int b = 500;
		
			Calculator cal = new Calculator();
			int actual = cal.subtract(a,b);
			
			String expected = "Error!";
			assertNotEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 50;
		int b = 30;
		
			Calculator cal = new Calculator();
			int actual = cal.multiply(a,b);
			
			int expected = 1500;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyBMax() {
		int a = 9999;
		int b = 9999;
		
			Calculator cal = new Calculator();
			int actual = cal.multiply(a,b);
			
			int expected = 99980001;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyBMin() {
		int a = 0;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.multiply(a,b);
			
			int expected = 0;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyError() {
		int a = -50;
		int b = 30;
		
			Calculator cal = new Calculator();
			int actual = cal.multiply(a,b);
			
			String expected = "Error!";
			assertNotEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 50;
		int b = 10;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a,b);
			
			int expected = 5;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideBMax() {
		int a = 9999;
		int b = 9999;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a,b);
			
			int expected = 1;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideBMin() {
		int a = 9999;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			
			int expected = 0;
			assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideError() {
		int a = -1;
		int b = 9999;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a,b);
			
			String expected = "Error!";
			assertNotEquals (expected, actual);
	}
	
}
