package com.company;

import java.util.Arrays;

public class Main {

    public  static int factorial(int a){
        int f = 1;
        for (int i = 2; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    public static String getPascalTriangle(int row){
        String result = "";
        String element = "";
        for (int  i = 0;  i <= row;  i++) {
            element = " " + factorial(row)/(factorial(i)* factorial(row-i));
            result += element;

        }
        return result.trim();
    }

    public static boolean taskOne(int[] array){
        double average = Arrays.stream(array).average().getAsDouble();
        return average == (int) average;
    }

    public static void main(String[] args) {
	    int[] array = new int[]{7,7};
        System.out.println(taskOne(array));



        int number = 50;
        String result = "";

        result = (number>=0) ? "positive" : "negative";
        System.out.println(result);



        System.out.println(getPascalTriangle(5));
    }


}
