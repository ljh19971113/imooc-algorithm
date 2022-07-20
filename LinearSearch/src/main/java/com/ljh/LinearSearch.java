package com.ljh;

import com.ljh.entity.Student;
import com.ljh.utils.ArrayGenerator;

public class LinearSearch {

    public static <T> int search(T[] data, T target) {
        for (int i=0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {1,5,8,8,9,15,66,99};
        System.out.println(search(data, 88));
        System.out.println(search(data, 66));

        Student[] students = {
                new Student("aaa", 18),
                new Student("bbb", 88),
                new Student("ccc", 100)
        };
        Student target = new Student("aaa", 188);
        System.out.println(search(students, target));

        data = ArrayGenerator.generateRandomIntegerArray(1000, 88);
        System.out.println(search(data, 85));
    }
}
