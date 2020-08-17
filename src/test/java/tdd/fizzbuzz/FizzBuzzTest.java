package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void startHere() {
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertThat(fizzBuzz.play(5)).isEqualTo(5);
    }
}
