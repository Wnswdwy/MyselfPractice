package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 20:40
 * 1. 判断101-200 之间有多少个素数，并输出所有素数
 */
public class Test01_PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 201; i++) {
            boolean istrue = true;
            for (int j = 2; j <= (int)Math.sqrt(i);j++ ){
                if(i % j == 0){
                    istrue = false;
                    break;
                }
            }
            if(istrue){
                System.out.println("第" + ++count + "个素数为："+  i);
            }
        }
    }
}
