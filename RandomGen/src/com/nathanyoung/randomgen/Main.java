package com.nathanyoung.randomgen;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int min = 1;
        int max = 1000000000;
        int size = 500;

        int[] random = new int[size];

        for(int i = 0; i < size; i++) {
            random[i] = makeRandom(min, max);
            System.out.println(random[i] + " ");
        }
    }

    public static int makeRandom(int min, int max) {
        Random random = new Random();
        return random.ints(min,(max+1)).findFirst().getAsInt();
    }
}
