package com.ljh.utils;

import com.ljh.entity.Student;

import java.util.Random;

public class ArrayGenerator {

    private ArrayGenerator(){}

    /**
     * 生成随机数字组成的数组
     * @param N 数组长度
     * @param limit 数组中值的大小
     * @return 长度为N的Integer数组
     */
    public static Integer[] generateRandomIntegerArray(int N, int limit) {
        Integer[] res = new Integer[N];
        Random random = new Random();
        for (int i=0; i < N; i++) {
            res[i] = random.nextInt(limit);
        }
        return res;
    }

    /**
     * 生成排好序的数组
     * @param N 数组长度
     * @return
     */
    public static Integer[] generateOrderedArray(int N) {
        Integer[] res = new Integer[N];
        for (int i=1; i <= N; i++) {
            res[i] = i;
        }
        return res;
    }

    /**
     * 生成一个学生数组，名字长度在5-10个字母，年龄在10-30
     * @param N 学生数组大小
     * @return
     */
    public static Student[] generateRandomStudents(int N) {
        Student[] students = new Student[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            String name = StringUtils.generateString(5 + random.nextInt(5));
            students[i] = new Student(name, 10 + random.nextInt(20));
        }
        return students;
    }

}
