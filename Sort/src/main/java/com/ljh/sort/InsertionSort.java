package com.ljh.sort;

import com.ljh.SortExample;
import com.ljh.utils.ArrayGenerator;
import com.ljh.utils.SortingHelper;

/**
 * 插入排序
 */
public class InsertionSort extends SortExample {

    public static<T extends Comparable<T>> void sort(T[] arr) {
        for (int i=1; i < arr.length; i++) {
            T data = arr[i];
            int j=i-1;
            for (; j > 0 && !less(arr[j], data); j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = data;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateRandomIntegerArray(100000, 1000);
//        InsertionSort.sort(arr);
//        InsertionSort.printArr(arr);
        SortingHelper.sortTest("InsertionSort", arr);
    }
}
