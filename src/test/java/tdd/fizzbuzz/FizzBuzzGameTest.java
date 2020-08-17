package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FizzBuzzGameTest {

	@Test
	public void testFizzBuzzGame(){
		FizzBuzzGame fizzBuzzGame=new FizzBuzzGame();
		assertThat(fizzBuzzGame.play(3)).isEqualTo("1,2,Fizz");
	}

}