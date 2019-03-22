package com.nathanyoung.quickselectstudy;

import java.util.Scanner;

import static com.nathanyoung.quickselectstudy.Main.ClearConsole;
import static com.nathanyoung.quickselectstudy.MakeRandom.makeArray;

public class ConsoleMenu {

    public static void begin() {
        ClearConsole();
        Scanner scanner = new Scanner(System.in);
        int size, kth, again;
        System.out.println("\nEnter the size of the array as an integer: ");
        size = scanner.nextInt();
        System.out.println("Enter the Kth Number: ");
        kth = scanner.nextInt();

        do {
            if (kth > size) {
                System.out.println("K cannot be bigger than the size of the array! Try again...\nEnter the Kth number: ");
                kth = scanner.nextInt();
            } else {
                System.out.println("Running it three times for science..\n " +
                        "The array is generated randomly each run, so the Kth smallest number will be different every time the method is called.\n");
                QsTest.startAnalysis(makeArray(size), kth);
                QsTest.startAnalysis(makeArray(size), kth);
                QsTest.startAnalysis(makeArray(size), kth);
            }
        } while (kth > size);

        System.out.println("\nWould you like to run again? Enter 0 to Exit, Enter 1 to run again");
        again = scanner.nextInt();

        switch (again) {
            case 1:
                begin();
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}
