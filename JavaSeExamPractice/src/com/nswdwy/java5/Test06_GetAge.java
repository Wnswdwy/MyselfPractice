package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 23:44
 * 第一个人 10，第 2个比第 1个人大 2岁，以此类推请 用递归方式计算出第 8个人多大？
 */
public class Test06_GetAge {
    public static void main(String[] args) {
        int startAge = 10;
        int counts = 3;
        int ages = f(startAge,counts);
        System.out.println("第" + counts + "个人：" + ages + "岁");
    }

    public static int f(int age, int counts) {
        if (counts == 1) {
            return age;
        }else{
            return f(age,--counts) + 2;
        }
    }
}

