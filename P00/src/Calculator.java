/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Tang Kee Kong
 * Student ID: 21030068
 * Class: W64N
 * Date/Time created: Tuesday 31-05-2022 11:14
 */

/**
 * @author 21030068
 *
 */
public class Calculator {
	public int add(int a, int b) {
		int total = a + b;
		
		if((a > 9999 || a < 0 ) && (b > 9999 || b < 0 )){
		total = 0;
	}
	
		return total;
		
	}
	
	public int subtract(int a, int b) {
		int total = a - b;
		
		if((a > 9999 || a < 0 ) && (b > 9999 || b < 0 )){
			total = 0;
	}
		return total;

	}
	
	public int multiply(int a, int b) {
		int total = a * b;
		
		if((a > 9999 || a < 0 ) && (b > 9999 || b < 0 )){
			total = 0;
	}
		return total;

	}
	
	
	public int divide(int a, int b) {
		int total = a/b;
		if(b==0) {
			throw new IllegalArgumentException();}
		
		if((a > 9999 || a < 0 ) && (b > 9999 || b < 0 )){
				total = 0;
	}
		return total;
	}
}
