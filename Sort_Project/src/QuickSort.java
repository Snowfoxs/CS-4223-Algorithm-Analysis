package com.nathanyoung.algocomparator;

import java.io.Console;

public class QuickSort {
    static long opCount;
    static int tiny = 10;
    static int small = 100;
    static int medium = 1000;
    static int large = 10000;
    static int huge = 100000;
    static int pushthelimit = 300000;
    static int breaktheprogram = 1000000;


    public static int[] doSort(int[] array, int a, int b) {
        opCount++;

        if (array == null || array.length == 0) {
            opCount++;
            return array;
        }
        opCount++;

        if (a >= b) {
            opCount++;
            return array;
        }
        opCount++;

        int mid = a + (b - a) / 2;
        opCount++;
        int switcharoo = array[mid];
        opCount++;

        int i = a, j = b;
        opCount++;

        while (i <= j) {
            opCount++;
            while (array[i] < switcharoo) {
                opCount++;
                i++;
            }

            while (array[j] > switcharoo) {
                opCount++;
                j--;
            }

            if (i <= j) {
                opCount++;
                int temp = array[i];
                opCount++;
                array[i] = array[j];
                opCount++;
                array[j] = temp;
                opCount++;
                i++;
                opCount++;
                j--;
                opCount++;
            }
            opCount++;
        }

        if (a < j)
            opCount++;
            doSort(array, a, j);

        if (b > i)
            opCount++;
            doSort(array, i, b);

        return array;
    }

    public static void runQuickSortTest() {
        // Generate Random Arrays
        int[] tinyArr = MakeRandoms.generate(tiny);
        System.out.println("Array of " + tiny + " Done");

        int[] smallArr = MakeRandoms.generate(small);
        System.out.println("Array of " + small + " Done");

        int[] medArr = MakeRandoms.generate(medium);
        System.out.println("Array of " + medium + " Done");

        int[] largeArr = MakeRandoms.generate(large);
        System.out.println("Array of " + large + " Done");

        int[] hugeArr = MakeRandoms.generate(huge);
        System.out.println("Array of " + huge + " Done");

        int[] deadlyArr = MakeRandoms.generate(pushthelimit);
        System.out.println("Array of " + pushthelimit + " Done");

        int[] breakTheProgramArr = MakeRandoms.generate(breaktheprogram);
        System.out.println("Array of " + breaktheprogram + " Done");

        showArray(tinyArr);

        doSort(tinyArr, 0, tinyArr.length-1);
        System.out.println("Quick Sort: " + tiny + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(smallArr, 0, smallArr.length-1);
        System.out.println("Quick Sort: " + small + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(medArr, 0, medArr.length-1);
        System.out.println("Quick Sort: " + medium + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(largeArr, 0, medArr.length-1);
        System.out.println("Quick Sort: " + large + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(hugeArr, 0, hugeArr.length-1);
        System.out.println("Quick Sort: " + huge + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(deadlyArr, 0, deadlyArr.length-1);
        System.out.println("Quick Sort: " + pushthelimit + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(breakTheProgramArr, 0, breakTheProgramArr.length-1);
        System.out.println("Quick Sort: " + breaktheprogram + " Items " + opCount + " Operations");
        opCount = 0;

        System.out.println("\nDone with Quick Sort! Run the program again for more options.\n\n");

        ConsoleMenu.ConsoleMenu();
    }

    public static void showArray(int[] arr) {
        System.out.println("\nVerifying Sort Works...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] sortedArr = doSort(arr, 0, arr.length-1);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println("\n");
    }
}
