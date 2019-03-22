package com.nathanyoung.algocomparator;

import java.util.Random;

public class MakeRandoms {
    public static int[] generate(int size) {
        int max = 100000;
        int min = 1;
        int[] randoms = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randoms[i] = random.ints(min,(max+1)).findFirst().getAsInt();
        }

        return randoms;
    }
}
