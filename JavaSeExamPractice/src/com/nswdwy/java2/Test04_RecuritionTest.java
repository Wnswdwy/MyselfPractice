package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-20 23:02
 * 通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5 并且小于10000 的整数，
 * 例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
 * 请用非递归的方式完成方法 long f( int n)的方法体。
 */
public class Test04_RecuritionTest {
    public static void main(String[] args) {
        int n = 100;
        long sum = f(n);
        System.out.println("递归后和为： " + sum);
    }

    public static long f(int n) {
        int sums = 0;
        for (int i = n; i > 0; i--) {
            sums += i;
        }
        return sums;
    }
}

