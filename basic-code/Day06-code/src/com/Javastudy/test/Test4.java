package com.Javastudy.test;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printArr(arr);
        int result = findArrMax(arr);
        System.out.println();
        System.out.println(result);
        boolean contain = isExistOrNot(arr, 8);
        System.out.println(contain);
        int[] copyarr = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.println(copyarr[i]);
        }
//        copyOfRange(arr, 0, 4);
    }

        public static void printArr (int[] arr){
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {

                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
            System.out.print("]");
        }

        public static int findArrMax (int[] arr){
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
        public static boolean isExistOrNot (int[] arr, int m){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == m) {
                    return true;
                }
            }
            return false;
        }

        public static int[] copyOfRange (int[] arr, int from, int to){
            int[] newArr = new int[to - from];
            int index = 0;
            for (int i = from; i < to; i++) {
                newArr[index] = arr[i];
                index++;
            }
            return newArr;
        }
}
