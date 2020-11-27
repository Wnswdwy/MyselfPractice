package com.nswdwy.java2;

import java.util.Scanner;

/**
 * @author yycstart
 * @create 2020-08-20 22:38
 * 编写方法实现：求某年某月某日是这一年的第几天
 */

public class Test03_WhichDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = sc.nextInt();
        System.out.println("请输入月：");
        int month = sc.nextInt();
        System.out.println("请输入日：");
        int day = sc.nextInt();
        int sum = 0;
        int temp = month;
        while(temp > 1){
            switch(--temp) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum += 30;
                    break;
                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        sum += 29;
                        break;
                    } else {
                        sum += 28;
                        break;
                    }
            }

        }
        System.out.println( year + "年 " + month + " 月" + day + " 日是当年的第" + (sum + day) + "天");

    }
}
