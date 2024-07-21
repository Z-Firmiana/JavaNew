package com.javastudy.test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[][] brr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        /*StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        System.out.println(sb.toString());*/

        for (int i = 0; i < arr.length; i++) {
            brr[i / 4][i % 4] = arr[i];
        }

        for (int i = 0; i < brr.length; i++) {
            for (int i1 = 0; i1 < brr[i].length; i1++) {
                System.out.print(brr[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
