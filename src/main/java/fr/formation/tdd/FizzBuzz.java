package fr.formation.tdd;

public class FizzBuzz {

	public String generate(int num) {
		
		if (num % 15 == 0)
			return "FizzBuzz";
		
		if (num % 3 == 0)
			return "Fizz";
		
		if (num % 5 == 0)
			return "Buzz";

		return String.valueOf(num);
	}
}
