package com.study.test;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = arrToString(arr);
        System.out.println(str);
    }

    
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int arr2 = 0; arr2 < arr.length -1; arr2++) {
            sb.append(arr[arr2]).append(", ");
        }
        
        return sb.append(arr[arr.length - 1]).append("]").toString();
        
    }
}
