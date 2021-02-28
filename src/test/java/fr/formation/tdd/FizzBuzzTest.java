package fr.formation.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	private static FizzBuzz fb;
	
	@BeforeAll
	private static void setUp(){
		fb = new FizzBuzz();
	}
	
	@Test
	public void doitRetourner1Si1() {
		
		assertEquals("1", fb.generate(1));
	}
	
	/*
	 
	 Création de la classe
	 
		package fr.formation.tdd;
		
		public class FizzBuzz {
		
			public String generate(int num) {
				return null;
			}
		}
	 
	 
	 Fail
	 
	public String generate(int num) {
		return "1";
	}
	 
	 */

	
	@Test
	public void doitRetourner2Si2() {
		
		assertEquals("2", fb.generate(2));
	}
	
/*	
	public String generate(int num) {
		if (num == 1)
			return "1";
		else
			return "2";
	}
	
	
	Refactoring  : Triangularisation
	************

	public String generate(int num) {
		return String.valueOf(num);
	}
		
*/	
	
	
	@Test
	public void doitRetournerFizzSi3() {
		
		assertEquals("Fizz", fb.generate(3));
	}
	
/*
 	public String generate(int num) {
		if (num == 3)
			return "Fizz";
		return String.valueOf(num);
	}
	
 */
	
	
	
	@Test
	public void doitRetournerFizzSi6() {
		
		assertEquals("Fizz", fb.generate(6));
	}
	
	
/*	
	public String generate(int num) {
		if (num == 3 || num == 6)
			return "Fizz";
		return String.valueOf(num);
	}
	
	
	Refactoring  : 
	************

	public String generate(int num) {
		if (num % 3 == 0)
			return "Fizz";
		return String.valueOf(num);
	}

	
*/	
	
	
	@Test
	public void doitRetournerBuzzSi5() {
		
		assertEquals("Buzz", fb.generate(5));
	}
	
/*
	public String generate(int num) {
		if (num % 3 == 0)
			return "Fizz";
		
		if (num == 5)
			return "Buzz";

		return String.valueOf(num);
	}
	
 */
	
	
	
	@Test
	public void doitRetournerBuzzSi10() {
		
		assertEquals("Buzz", fb.generate(10));
	}
	
/*	
	public String generate(int num) {
		if (num % 3 == 0)
			return "Fizz";
		
		if (num == 5 || num == 10)
			return "Buzz";

		return String.valueOf(num);
	}
	
	Refactoring  : 
	************
	*
	public String generate(int num) {
		if (num % 3 == 0)
			return "Fizz";
		
		if (num % 5 == 0)
			return "Buzz";

		return String.valueOf(num);
	}
*/	
	
	
	
	@Test
	public void doitRetournerFizzBuzzSi15() {
		
		assertEquals("FizzBuzz", fb.generate(15));
	}
	
/*	
	public String generate(int num) {
		
		if (num == 15)
			return "FizzBuzz";
		
		if (num % 3 == 0)
			return "Fizz";
		
		if (num % 5 == 0)
			return "Buzz";

		return String.valueOf(num);
	}
*/	
	
	
	
	@Test
	public void doitRetournerFizzBuzzSi30() {
		
		assertEquals("FizzBuzz", fb.generate(30));
	}

/*	
	public String generate(int num) {
		
		if (num == 15 || num == 30)
			return "FizzBuzz";
		
		if (num % 3 == 0)
			return "Fizz";
		
		if (num % 5 == 0)
			return "Buzz";

		return String.valueOf(num);
	}	
	
	
	Refactoring  : 
	************
	
	public String generate(int num) {
		
		if (num % 15 == 0)
			return "FizzBuzz";
		
		if (num % 3 == 0)
			return "Fizz";
		
		if (num % 5 == 0)
			return "Buzz";

		return String.valueOf(num);
	}
	
*/	
	
}
