package com.javastudy.demo;

public class QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序：
        第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
        比基准数小的全部在左边，比基准数大的全部在右边。
        后面以此类推。

        注意：必须先移动end！！！！！！！！
         */
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        //基准数
        int baseNumber = arr[i];

        while (start != end) {


            //end
            while (true) {
                if (arr[end] < baseNumber || start >= end) {
                    break;
                }
                end--;
            }
            //start
            while (true) {
                if (arr[start] > baseNumber || start >= end) {
                    break;
                }
                start++;
            }
            //交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //基准数归为
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
