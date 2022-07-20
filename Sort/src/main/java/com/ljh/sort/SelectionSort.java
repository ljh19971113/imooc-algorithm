package com.ljh.sort;

import com.ljh.SortExample;
import com.ljh.entity.Student;
import com.ljh.utils.ArrayGenerator;

/**
 * 选择排序
 */
public class SelectionSort extends SortExample {

    public static<T extends Comparable<T>> void sort(T[] arr) {
        for (int i=0; i < arr.length; i++) {
            int minIndex = i;
            for (int j=i; j < arr.length; j++) {
                if (less(arr[j], arr[minIndex])) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateRandomIntegerArray(10000, 1000);
        SelectionSort.sort(arr);
        SelectionSort.checkIsOrder(arr);
        SelectionSort.printArr(arr);

        Student[] students = ArrayGenerator.generateRandomStudents(100);
        SelectionSort.checkIsOrder(students);
        SelectionSort.sort(students);
        SelectionSort.printArr(students);
        SelectionSort.checkIsOrder(students);
    }
}
