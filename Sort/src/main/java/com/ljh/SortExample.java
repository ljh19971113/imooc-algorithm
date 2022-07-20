package com.ljh;

public class SortExample {

    /**
     * 比较两个值的大小,返回 ”a < b“
     * @param a
     * @param b
     * @return
     * @param <T>
     */
    public static<T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 交换数组中 indexA 和 indexB 坐标元素的位置
     * @param arr
     * @param indexA
     * @param indexB
     */
    public static<T extends Comparable<T>> void swap(T[] arr, int indexA, int indexB) {
        T temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    /**
     * 检查顺序
     * @param arr
     * @return
     */
    public static<T extends Comparable<T>> void checkIsOrder(T[] arr) {
        for (int i=1; i < arr.length; i++) {
            if (less(arr[i], arr[i-1])) {
                System.out.println("Array is not order");
                break;
            }
        }
        System.out.println("Array is order");
    }

    /**
     * 打印输出数组，每行数据超过100字符换行
     * @param arr
     * @param <T>
     */
    public static<T extends Comparable<T>> void printArr(T[] arr) {
        int len = 0;
        for (int i=0; i< arr.length; i++) {
            len += arr[i].toString().length() + 1;
            System.out.print(arr[i] + " ");
            if (len > 100) {
                System.out.println();
                len = 0;
            }
        }
        if (len != 0) {
            System.out.println();
        }
    }

}
