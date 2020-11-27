package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 23:40
 * 1+2！+3！+...+20! = ?
 */
public class Test05_GetJieCheng {
    public static void main(String[] args) {
        long sum = 0 ;
        for (int i = 1; i <= 5 ; i++) {
            sum += f(i);
        }
        System.out.println(sum);
    }
    public static long f(int i){
        int temp = 1;
        for (int j = 1; j <= i; j++) {
            temp *= j;
        }
        return temp;
    }
}
