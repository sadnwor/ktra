package org.example.function;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {

    @Test
    void testWithOnlyEvenNumbers() {
        int[] numbers = {2, 4, 8, 10};
        assertEquals(24, Number.sumEvenNumbersExcludingMultiplesOfSix(numbers));
    }

    @Test
    void testWithMultiplesOfSix() {
        int[] numbers = {2, 4, 6, 8, 12, 18};
        assertEquals(14, Number.sumEvenNumbersExcludingMultiplesOfSix(numbers));
    }

    @Test
    void testWithOddNumbers() {
        int[] numbers = {1, 3, 5, 7, 9};
        assertEquals(0, Number.sumEvenNumbersExcludingMultiplesOfSix(numbers));
    }

    @Test
    void testWithMixedNumbers() {
        int[] numbers = {1, 2, 3, 4, 6, 9, 12, 14};
        assertEquals(20, Number.sumEvenNumbersExcludingMultiplesOfSix(numbers));
    }

    @Test
    void testWithEmptyArray() {
        int[] numbers = {};
        assertEquals(0, Number.sumEvenNumbersExcludingMultiplesOfSix(numbers));
    }
}

