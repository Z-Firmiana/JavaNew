package com.study.demo;

public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // int[] arr = null;
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr){
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }
        
        String str = "[";
        for (int arr2 = 0; arr2 < arr.length; arr2++) {
            int c = arr[arr2];
            if (arr2 < arr.length - 1) {
                str = str + c + ", ";
            } else {
                str = str + c;
            }
        }
        str = str + "]";
        return str;
    }
}
