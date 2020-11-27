package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-21 22:44
 * 用实现 Runnable 接口的方式，启动一个线程完成在线
 * 程中打印 1-100 的数字
 */
public class Test18_Thread {
    public static void main(String[] args) {
        Runnable runner = new Runner();
        Thread thread = new Thread(runner);
        thread.start();
    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("第"+ i + "个数：" + i);
        }
    }
}