package org.example.function;

public class Number {
    public static int sumEvenNumbersExcludingMultiplesOfSix(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0 && num % 6 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}

