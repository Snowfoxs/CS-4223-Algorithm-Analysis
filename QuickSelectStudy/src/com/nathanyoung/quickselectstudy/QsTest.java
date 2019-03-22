package com.nathanyoung.quickselectstudy;

import java.util.Arrays;

public class QsTest {
    static final int group3 = 3, group5 = 5, group7 = 7;
    static double ops;

    public static void qsTest() {
        int[] sample = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int k = 7;
        ops = 0;
        int kth;

        System.out.println("(K = 7) Testing array: ");
        for (int i = 0; i < sample.length; i++) {
            System.out.print(sample[i] + " ");
        }
        System.out.println();
        for (int i = 3; i < 8; i = i + 2) {
            ops = 0;
            kth = quickSelect(sample, 0, sample.length - 1, k, i);

            System.out.println("Groups of " + i + ":\tOperations: " + ops + "\t Found: " + kth);

        }
    }

    public static void startAnalysis(int[] numbers, int k) {
        int kth;

        for (int i = 3; i < 8; i = i + 2) {
            ops = 0;
            kth = quickSelect(numbers, 0, numbers.length - 1, k, i);
            System.out.println("Array of: " + numbers.length + "\tK: " + k + "\tGroups of " + i + ":\tOperations: " + ops + "\t Found: " + kth);
        }

    }

    public static int quickSelect(int[] A, int left, int right, int k, int group) {
        ops++;
        if (k > 0 && k <= right - left + 1) {
            ops++;
            int n = right - left + 1, i;
            ops++;
            int median[] = new int[(n + group - 1) / group];
            ops++;
            int medianMedian;
            ops++;
            for (i = 0; i < n / group; i++) {
                Arrays.sort(A, left + i * group, (left + i * group) + group);
                median[i] = A[((left + i * group) + group) / 2];
                ops++;
            }
            if (i * group < n) {
                ops++;
                Arrays.sort(A, left + i * group, (left + i * group) + (n % group));
                ops++;
                median[i] = A[(left + i * group + n % group) / 2];
                ops++;
                i++;
                ops++;
            }
            ops++;
            if (i == 1) {
                ops++;
                medianMedian = median[i - 1];
            } else {
                ops++;
                medianMedian = quickSelect(median, 0, i - 1, i / 2, group);
            }
            ops++;
            int pivot = partition(A, left, right, medianMedian);
            ops++;
            if (pivot - left == k - 1) {
                ops++;
                return A[pivot];
            }
            ops++;
            if (pivot - left > k - 1) {
                ops++;
                return quickSelect(A, left, pivot - 1, k, group);
            }
            ops++;
            return quickSelect(A, pivot + 1, right, k - pivot + left - 1, group);
        }
        return -1;
    }

    public static int partition(int[] A, int left, int right, int val) {
        ops++;
        int i;
        for (i = left; i < right; i++) {
            ops++;
            if (A[i] == val) {
                ops++;
                break;
            }
            ops++;
        }
        swap(A, i, right);
        ops++;
        int pivotElement = A[right];
        ops++;
        int index = left;
        ops++;
        for (i = left; i <= right; i++) {
            ops++;
            if (A[i] < pivotElement) {
                ops++;
                swap(A, index, i);
                index++;
            }
            ops++;
        }
        swap(A, right, index);
        ops++;
        return index;
    }

    public static void swap(int[] A, int first, int last) {
        ops++;
        int temp = A[first];
        ops++;
        A[first] = A[last];
        ops++;
        A[last] = temp;
        ops++;
    }
}
