package com.nathanyoung.algocomparator;

public class MergeSort {
    static long opCount;
    static int tiny = 10;
    static int small = 100;
    static int medium = 1000;
    static int large = 10000;
    static int huge = 100000;
    static int pushthelimit = 300000;
    static int breaktheprogram = 1000000;

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        opCount++;

        for (int k = 0; k < c.length; k++) {
            if (i >= a.length) {
                c[k] = b[j++];
                opCount++;
            }
            else if (j >= b.length) {
                c[k] = a[i++];
                opCount++;
            }
            else if (a[i] <= b[j]){
                c[k] = a[i++];
                opCount++;
            }
            else {
                c[k] = b[j++];
                opCount++;
            }
            opCount++;
        }
        return c;
    }

    public static int[] doSort(int[] input) {
        int N = input.length;
        opCount++;

        if (N <= 1) return input;
        opCount++;

        int[] a = new int[N / 2];
        opCount++;

        int[] b = new int[N - N / 2];
        opCount++;

        for (int i = 0; i < a.length; i++) {
            a[i] = input[i];
            opCount++;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = input[i + N / 2];
            opCount++;
        }
        return merge(doSort(a), doSort(b));
    }

    public static void runMergeSortTest() {
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

        doSort(tinyArr);
        System.out.println("Merge Sort: " + tiny + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(smallArr);
        System.out.println("Merge Sort: " + small + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(medArr);
        System.out.println("Merge Sort: " + medium + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(largeArr);
        System.out.println("Merge Sort: " + large + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(hugeArr);
        System.out.println("Merge Sort: " + huge + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(deadlyArr);
        System.out.println("Merge Sort: " + pushthelimit + " Items " + opCount + " Operations");
        opCount = 0;
        doSort(breakTheProgramArr);
        System.out.println("Merge Sort: " + breaktheprogram + " Items " + opCount + " Operations");
        opCount = 0;

        System.out.println("\nDone with Merge Sort! Run the program again for more options.\n\n");
        ConsoleMenu.ConsoleMenu();
    }

    public static void showArray(int[] arr) {
        System.out.println("\nVerifying Sort Works...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] sortedArr = doSort(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println("\n");
    }
}
