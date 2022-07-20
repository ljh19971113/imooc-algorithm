package com.ljh.utils;

import java.util.Random;

public class StringUtils {

    /**
     * 生成随机字符串，长度为N，字符串全部由小写字母组成
     * @param N
     * @return
     */
    public static String generateString(int N) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            char c = (char) ('a' + random.nextInt(26));
            builder.append(c);
        }
        return builder.toString();
    }
}
