package com.example.sphwintegerlist2.sortcomparison;

import com.example.sphwintegerlist2.sortcomparison.sorts.BubbleSort;
import com.example.sphwintegerlist2.sortcomparison.sorts.InsertionSort;
import com.example.sphwintegerlist2.sortcomparison.sorts.SelectionSort;
import com.example.sphwintegerlist2.sortcomparison.sorts.Sort;

import java.util.Arrays;
import java.util.Random;

public class SortComparison {

    public static final int ELEMENTS_COUNT = 100_000;

    public static void main(String[] args) {
        int[] arrayForTest = generateRandomArray();

        showSortingTime(arrayForTest);
    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[ELEMENTS_COUNT];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(Integer.MAX_VALUE);
        }

        return array;
    }

    private static void showSortingTime(int[] target) {
        System.out.println("Bubble sort time expenditure: " +
                measureSortTime(new BubbleSort(), Arrays.copyOf(target, ELEMENTS_COUNT)));
        System.out.println("Selection sort time expenditure: " +
                measureSortTime(new SelectionSort(), Arrays.copyOf(target, ELEMENTS_COUNT)));
        System.out.println("Insertion sort time expenditure: " +
                measureSortTime(new InsertionSort(), Arrays.copyOf(target, ELEMENTS_COUNT)));

    }

    private static long measureSortTime(Sort instance, int[] target) {
        long start = System.currentTimeMillis();
        instance.sort(target);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
