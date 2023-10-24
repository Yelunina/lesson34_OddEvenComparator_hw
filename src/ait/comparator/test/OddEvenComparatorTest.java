package ait.comparator.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddEvenComparatorTest {


    @Test
    void testOddEvenComparator1() {
        System.out.println("=========================================");
        Comparator<Integer> oddEvenComp = (n1, n2) -> {
            if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1;
            }
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            return 0;
        };
        Integer[] actual = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
        printArray(actual);
        Arrays.sort(actual, oddEvenComp);
        printArray(actual);
    }
    @Test
    void testOddEvenComparator2() {
        System.out.println("=========================================");
        Comparator<Integer> oddEvenComp = (n1, n2) -> {
            if (n1 % 2 != 0 && n2 % 2 == 0) {
                return 1;
            }
            if (n1 % 2 == 0 && n2 % 2 != 0) {
                return -1;
            }
            if (n1 % 2 == 0 && n2 % 2 == 0) {
                return n1 - n2;
            }
            if (n1 % 2 != 0 && n2 % 2 != 0) {
                return n2 - n1;
            }
            return 0;
        };
        Integer[] actual = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
        printArray(actual);
        Integer[] expected = { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
        Arrays.sort(actual, oddEvenComp);
        printArray(actual);
        assertArrayEquals(expected, actual);
    }
    private void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}