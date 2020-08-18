package tdd.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzzGame {

	FizzBuzz fizzBuzz=new FizzBuzz();

	public String play(final int max) {
		return IntStream.rangeClosed(1,max)
				.mapToObj(number-> fizzBuzz.play(number))
				.collect(Collectors.joining(","));
	}
}
