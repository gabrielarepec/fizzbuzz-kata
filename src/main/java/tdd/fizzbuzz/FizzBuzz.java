package tdd.fizzbuzz;

import javax.print.attribute.standard.Severity;


public class FizzBuzz {

	private static final int FIVE = 5;
	private static final int THREE = 3;
	public static final int SEVEN = 7;

	public String play(final int number) {
		if(number<=0) throw  new FizzBuzzException(String.format("Number: %d is wrong.",number));
		final StringBuilder result=new StringBuilder();
		if(isDividableBy3(number) || numberContainsThree(number))
			result.append("Fizz");
		if(isDividableBy5(number) || numberContainsFive(number))
			result.append("Buzz");
		if(isDividableBy7(number) || numberContainsSeven(number))
			result.append("Bar");
		return result.toString().isEmpty()? String.valueOf(number) :result.toString();
	}

	private boolean numberContainsSeven(final int number) {
		return numberContainsDigit(number,String.valueOf(SEVEN));
	}

	private boolean isDividableBy7(final int number) {
		return isDividableBy(number, SEVEN);
	}

	private boolean numberContainsThree(final int number) {
		return numberContainsDigit(number,String.valueOf(THREE));
	}

	private boolean numberContainsFive(final int number) {
		return numberContainsDigit(number,String.valueOf(FIVE));
	}
	private boolean numberContainsDigit(final int number, final String s) {
		return String.valueOf(number).contains(s);
	}

	private boolean isDividableBy5(final int number) {
		return isDividableBy(number, FIVE);
	}

	private boolean isDividableBy3(final int number) {
		return isDividableBy(number, THREE);
	}

	private boolean isDividableBy(final int number, final int divider) {
		return number%divider==0;
	}
}
