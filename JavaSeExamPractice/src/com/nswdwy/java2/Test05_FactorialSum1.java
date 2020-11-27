package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-21 20:30
 */
public class Test05_FactorialSum1 {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 1; i <= 20; i++){
            long temp = 1;
            for( int j = 1 ; j <= i; j++){
                temp *= j;
            }
            sum += temp;
        }
        System.out.println(sum);
    }
}
