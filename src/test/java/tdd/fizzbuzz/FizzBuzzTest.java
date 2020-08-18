package tdd.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


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

    @Test
    public void play_shouldReturnBuzz_whenNumberIsDivisibleBy5() {
        assertFizzBuzz(5, "Buzz");
    }

    @Test
    public void play_shouldReturnFizzBuzz_whenNumberIsDivisibleBy5And3() {
        assertFizzBuzz(15, "FizzBuzz");
    }

    @Test
    public void play_shouldReturnEx_whenNumberIsDivisibleBy5And3() {
        assertFizzBuzzException(0);
        assertFizzBuzzException(-1);
    }
    @Test
    public void play_shouldReturnFizz_whenNumberContains3() {
        assertFizzBuzz(31,"Fizz");
    }

    @Test
    public void play_shouldReturnBuzz_whenNumberContains5() {
        assertFizzBuzz(52,"Buzz");
    }

    @Test
    public void play_shouldReturnFizzBuzz_whenNumberContains3AndIsDivisibleBy5() {
        assertFizzBuzz(35,"FizzBuzz");
    }

    @Test
    public void play_shouldReturnFizzBuzz_whenNumberContains5AndIsDivisibleBy3() {
        assertFizzBuzz(51,"FizzBuzz");
    }

    @Test
    public void play_shouldReturnBuzz_whenNumberContains5AndIsDivisibleBy5() {
        assertFizzBuzz(50,"Buzz");
    }

    @Test
    public void play_shouldReturnFizz_whenNumberContains3AndIsDivisibleBy3() {
        assertFizzBuzz(33,"Fizz");
    }

    @Test
    public void play_shouldReturnFizzBuzz_whenNumberIsDivisibleBy5And3AndDoesNotContain5and3() {
        assertFizzBuzz(60,"FizzBuzz");
    }

    private void assertFizzBuzzException(final int number) {
        assertThatExceptionOfType(FizzBuzzException.class)
                .isThrownBy(()->FIZZ_BUZZ.play(number));
    }

    private void assertFizzBuzz(final int i, final String s) {
        assertThat(FIZZ_BUZZ.play(i)).isEqualTo(s);
    }
}
