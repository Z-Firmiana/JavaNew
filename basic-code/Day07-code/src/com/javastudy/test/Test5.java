package com.javastudy.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = getNum(856484521);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            num = num * 10 + arr[i];
        }
        System.out.println();
        System.out.println(num);

    }

    public static int[] getNum(int number) {
        int num1 = number;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = num1 % 10;
            num1 = num1 / 10;
        }
        return arr;
    }
}
