package com.nathanyoung.algocomparator;

import java.util.Scanner;

import static com.nathanyoung.algocomparator.AlgoComparator.ClearConsole;


public class ConsoleMenu {
    public static void ConsoleMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        MakeMenu();
        choice = scanner.nextInt();


        switch (choice) {
            case 1:
                ClearConsole();
                SelectionSort.doMagic();
                break;
            case 2:
                ClearConsole();
                MergeSort.runMergeSortTest();
                break;
            case 3:
                ClearConsole();
                QuickSort.runQuickSortTest();
                break;
            case 99:
                break;
            default:
                ConsoleMenu();
                break;
        }
    }

    public static void MakeMenu() {
        System.out.println("\t1  | Selection Sort");
        System.out.println("\t2  | Merge Sort");
        System.out.println("\t3  | Quick Sort");
        System.out.println("\t99 | Exit");
        System.out.print("Enter Choice:\t");
    }
}
