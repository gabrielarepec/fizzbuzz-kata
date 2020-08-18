package tdd.fizzbuzz;

public class FizzBuzz {

	private static final int FIVE = 5;
	private static final int THREE = 3;

	public String play(final int number) {
		if(number<=0) throw  new FizzBuzzException(String.format("Number: %d is wrong.",number));
		final StringBuilder result=new StringBuilder();
		if(isDividableBy3(number) || numberContains3(number)) result.append("Fizz");
		if(isDividableBy5(number) || numberContains5(number)) result.append("Buzz");
		return result.toString().isEmpty()? String.valueOf(number) :result.toString();
	}
	private boolean numberContains3(final int number) {
		return numberContainsDigit(number,String.valueOf(THREE));
	}

	private boolean numberContains5(final int number) {
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
