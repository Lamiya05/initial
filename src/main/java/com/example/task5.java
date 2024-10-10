package com.example;

public class task5 {
    public static int findOdd(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR işlemi
        }
        return result;
    }
}
