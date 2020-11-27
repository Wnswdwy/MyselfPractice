package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 21:22
 * 第1次落地时，经过了：150.0米,第10次反弹的高度是：50.0米
 * 第2次落地时，经过了：225.0米,第10次反弹的高度是：25.0米
 * 第3次落地时，经过了：262.5米,第10次反弹的高度是：12.5米
 * 第4次落地时，经过了：281.25米,第10次反弹的高度是：6.25米
 * 第5次落地时，经过了：290.625米,第10次反弹的高度是：3.125米
 * 第6次落地时，经过了：295.3125米,第10次反弹的高度是：1.5625米
 * 第7次落地时，经过了：297.65625米,第10次反弹的高度是：0.78125米
 * 第8次落地时，经过了：298.828125米,第10次反弹的高度是：0.390625米
 * 第9次落地时，经过了：299.4140625米,第10次反弹的高度是：0.1953125米
 * 第10次落地时，经过了：299.70703125米,第10次反弹的高度是：0.09765625米
 */
public class Test02 {
    public static void main(String[] args) {
        double height = 100;
        double distance = 0;
        int count = 10;
        for (int i = 1; i <= count; i++) {
            distance += height;// 加落下的距离
            height = height / 2;// 弹起的高度
            if (i <= count) {
                distance += height; // 加弹起的距离
                System.out.println("第" + i + "次落地时，经过了：" + distance + "米"+",第" + count + "次反弹的高度是：" + height + "米");
//                System.out.println("第" + count + "次反弹的高度是：" + height + "米");
            }
        }

//            System.out.println("第" + count + "次落地时，经过了：" + distance + "米");
//            System.out.println("第" + count + "次反弹的高度是：" + height + "米");
        }
    }
