package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void play_shouldReturnNumber_whenNumberIsNotDivisibleBy3or5() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertThat(fizzBuzz.play(1)).isEqualTo("1");
        assertThat(fizzBuzz.play(7)).isEqualTo("7");
    }

    @Test
    public void play_shouldReturnFizz_whenNumberIsDivisibleBy3() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertThat(fizzBuzz.play(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.play(6)).isEqualTo("Fizz");
    }
}
