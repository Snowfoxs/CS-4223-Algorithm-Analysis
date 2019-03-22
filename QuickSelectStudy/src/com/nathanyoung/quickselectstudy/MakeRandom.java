package com.nathanyoung.quickselectstudy;

import java.util.Random;

public class MakeRandom {
    public static int makePivot(int min, int max) {
        if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid Pivot!");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    public static int[] makeArray(int size) {
        int max = 100000;
        int min = 1;
        int[] randoms = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randoms[i] = random.ints(min, (max + 1)).findFirst().getAsInt();
        }

        return randoms;
    }
}
