package com.nathanyoung.quickselectstudy;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ConsoleMenu.begin();
    }

    public final static void ClearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
    }
}
