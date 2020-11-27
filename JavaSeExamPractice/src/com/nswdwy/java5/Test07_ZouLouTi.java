package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-25 0:04
 * 有 n步台阶，步台阶，一次只能上 1步或 2步共有多少种走法？
 */
public class Test07_ZouLouTi {
    public static void main(String[] args) {
        int counts = 10;
        System.out.println("共"+ counts + "步台阶，共有" + methods(10) + "种走法");
    }
    public static int methods(int n){
        if(n <= 2){
            return 2;
        }else{
            int x = methods(n-2) + methods(n-1);
            return x;
        }
    }
}
