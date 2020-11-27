package com.nswdwy.java2;

import java.io.OutputStreamWriter;

/**
 * @author yycstart
 * @create 2020-08-20 23:35
 * 输出一个如下图形，一共有 n 行，第 n 行有 2n-1 个*，完成方法public void printStar(int n)的方法体
 *          *
 *         ***
 *        ******
 */
public class Test06_PrintStart {
    public static void main(String[] args) {
        int n = 6;
        printStar(n);
    }
    public static void printStar(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= (n+1)/2  ; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2 * i -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
