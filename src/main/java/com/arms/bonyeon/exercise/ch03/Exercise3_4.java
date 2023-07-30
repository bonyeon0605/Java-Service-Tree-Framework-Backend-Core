package com.arms.bonyeon.exercise.ch03;

public class Exercise3_4 {
    public static void main(String[] args) {
        int num = 456435;
        String numberStr = String.valueOf(num);
        char firstNumber = numberStr.charAt(0);

        StringBuffer result = new StringBuffer();

        result.append(firstNumber);
        for (int i = 0; i < numberStr.length() - 1; i++) {
            result.append("0");
        }
        System.out.println(result);
    }
}
