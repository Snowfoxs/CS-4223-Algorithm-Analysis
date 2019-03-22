package com.nathanyoung.algocomparator;

public class SelectionSort {
    static long opCount;
    static int tiny = 10;
    static int small = 100;
    static int medium = 1000;
    static int large = 10000;
    static int huge = 100000;
    static int pushthelimit = 300000;
    static int breaktheprogram = 1000000;

    public static int[] doSort(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            opCount++;
            for (int j = i + 1; j < arr.length; j++) {
                opCount++;
                if (arr[j] < arr[index]) {
                    opCount++;
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            opCount++;
            arr[index] = arr[i];
            opCount++;
            arr[i] = smallerNumber;
            opCount++;
            System.out.print("\rSelection Sort: " + arr.length + " Items " + opCount + " Operations");
        }
        return arr;
    }

    public static void doMagic() {
        // Generate Random Arrays
        System.out.println("\nGenerating Random Arrays...");

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
        opCount = 0;
        doSort(smallArr);
        opCount = 0;
        doSort(medArr);
        opCount = 0;
        doSort(largeArr);
        opCount = 0;
        doSort(hugeArr);
        opCount = 0;
        System.out.println("\nThis one takes a few minutes, program is still running! I've tested it!");
        doSort(deadlyArr);
        opCount = 0;
        doSort(breakTheProgramArr);
        opCount = 0;

        System.out.println("\nDone with Selection Sort! Run the program again for more options.\n\n");
        ConsoleMenu.ConsoleMenu();
    }

    public static void showArray(int[] arr) {
        System.out.println("\nVerifying Sort Works...");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] sortedArr = doSort(arr);
        System.out.println();
        for(int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println("\n");
    }
}
