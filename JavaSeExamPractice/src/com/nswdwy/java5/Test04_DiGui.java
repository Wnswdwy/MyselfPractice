package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 23:27
 * 4.通项公式如下： f(n)=n + (n-1) + (n-2) + .... + 1，其中 ，
 * 其中 ，其中 n是大于 等5并且小于 10000的整数，
 * 例如： f(5) = 5 + 4 +3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
 * 请用递归的方式完成法  long f( int n)的方法体。
 */
public class Test04_DiGui {
    public static void main(String[] args) {
        long sums = f(10);
        System.out.println(sums);
    }

    public static long f(int n) {
        int sum = 0;
        if (n == 1) {
            sum += 1;
        } else {
            sum += n + f(n - 1);
        }
        return sum;
    }

}
