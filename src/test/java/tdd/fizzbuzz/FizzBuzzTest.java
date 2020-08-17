package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    public static final FizzBuzz FIZZ_BUZZ = new FizzBuzz();

    @Test
    public void play_shouldReturnNumber_whenNumberIsNotDivisibleBy3or5() {
        assertFizzBuzz(1, "1");
        assertFizzBuzz(7, "7");
    }

    @Test
    public void play_shouldReturnFizz_whenNumberIsDivisibleBy3() {
        assertFizzBuzz(3, "Fizz");
        assertFizzBuzz(6, "Fizz");
    }

    private void assertFizzBuzz(final int i, final String s) {
        assertThat(FIZZ_BUZZ.play(i)).isEqualTo(s);
    }
}
