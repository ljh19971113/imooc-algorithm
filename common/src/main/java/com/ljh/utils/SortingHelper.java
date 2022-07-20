package com.ljh.utils;

import com.ljh.SortExample;
import com.ljh.sort.InsertionSort;
import com.ljh.sort.SelectionSort;

public class SortingHelper {

    public static<E extends Comparable<E>> void sortTest(String sortname, E[] arr) {
        long startTime = System.nanoTime();
        switch (sortname) {
            case "SelectionSort":
                SelectionSort.sort(arr);
                break;
            case "InsertionSort":
                InsertionSort.sort(arr);
                break;
            default:
                System.out.println("error sortname");
        }

        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000_000_000.0;
        SortExample.checkIsOrder(arr);
        System.out.println(time + " s");
    }
}
