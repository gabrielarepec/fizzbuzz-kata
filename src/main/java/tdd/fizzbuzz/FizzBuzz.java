package tdd.fizzbuzz;

public class FizzBuzz {

	public String play(final int number) {
		if(number<=0) throw  new FizzBuzzException(String.format("Number: %d is wrong.",number));
		StringBuilder result=new StringBuilder();
		if(number%3==0) result.append("Fizz");
		if(number%5==0) result.append("Buzz");
		return result.toString().isEmpty()?String.valueOf(number):result.toString();
	}
}
