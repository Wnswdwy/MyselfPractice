package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-20 22:25
 * 用循环控制语句打印输出：1+3+5+...+99=?的结果
 *
 */
public class Test01_Numberhundred {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("1+3+5+...+99=" + sum) ;

    }
}
