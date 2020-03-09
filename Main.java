package com.kruger.brandt;


import java.util.Arrays;
import java.util.BitSet;

public class Main {

    static private int[] getMissingNumbers(int[] numbers, int numbersSize){


        int missingNumbersCount = numbersSize - numbers.length;
        int[] missingNumbers = new int[missingNumbersCount];

        BitSet bitSet = new BitSet(numbersSize);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        int lastMissingIndex = 0;
        for (int i = 0; i < missingNumbersCount; i++){
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            missingNumbers[i] = ++lastMissingIndex;
        }

        return missingNumbers;
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4 ,7, 8, 10 ,33};
        int[] missingNumbers = getMissingNumbers(numbers, 33);

        System.out.println(Arrays.toString(missingNumbers));
    }
}
