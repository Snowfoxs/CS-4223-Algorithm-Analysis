package com.nathanyoung.algocomparator;

import java.io.IOException;



public class AlgoComparator {

    public static void main(String[] args) throws IOException {
        ConsoleMenu.ConsoleMenu();
    }

    public final static void ClearConsole(){
        for(int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }
}
