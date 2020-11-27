package com.nswdwy.java2;

import java.util.Scanner;

/**
 * @author yycstart
 * @create 2020-08-20 23:10
 * 5、求1+2！+3！+...+20！的和
 */
public class Test05_FactorialSum {
    public static void main(String[] args) {
        System.out.println("请输入你想从那个数以下的阶乘和：");
        int n = new Scanner(System.in).nextInt();
        int temp = n;
        SumClass sumClass = new SumClass();
        long finalSum = sumClass.Sum(temp);
        System.out.println( n +"那个数以下的阶乘和为：" + finalSum);
    }
}
class SumClass {
    long sums = 0;

    public long Sum(int n) {
        while (n > 0) {
            sums += getSum(n--);
        }
            return sums;
    }

    public long getSum(int n) {
        long sum = 1;
        for (int i = n; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }
}

