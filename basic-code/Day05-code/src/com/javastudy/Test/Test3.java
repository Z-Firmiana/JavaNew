package com.javastudy.Test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        int j = arr.length - 1;
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + "  ");
        }
    }
}
