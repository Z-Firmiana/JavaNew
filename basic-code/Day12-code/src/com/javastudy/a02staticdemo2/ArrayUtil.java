package com.javastudy.a02staticdemo2;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }

    public static double getAerage(int[] arr) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return avg = sum / arr.length;
    }
}
