package com.br.algoritmos.basic;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {

        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}
        for (int num : array) {
            updateLargest(threeLargest, num);
        }

        return threeLargest;
    }

    public static void updateLargest(int [] threeLargest, int num) {
        if(num > threeLargest[2]) {
            changeAndUpdate(threeLargest, num, 2);
        } else if (num > threeLargest[1]) {
            changeAndUpdate(threeLargest, num, 1);
        } else if (num > threeLargest[0]) {
            changeAndUpdate(threeLargest, num, 0);
        }
    }

    public static void changeAndUpdate(int[] array, int num) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                array[i] = num;
            } else {
                array[i] = array[i + 1];
            }
        }
    }
}
