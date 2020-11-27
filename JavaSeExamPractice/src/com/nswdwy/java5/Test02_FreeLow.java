package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 21:12
 * . 一个球从 100 米高度自由落下，每次落地后反跳回原高度的一半，
 * 再落下，求它在第10 次落地时，共经过多少米？第10 次反弹多高？
 */
public class Test02_FreeLow {
    public static void main(String[] args) {

        freeLoop(100,0,1);

    }
    public static void freeLoop(double  heigh,double sum,int count){
        sum += heigh;
        heigh = heigh /2;
        if(count <= 10) {
            sum += heigh;
            System.out.println("第" + count + "落地共经历了" + sum + ",第" + count + "反弹高度为：" + heigh);
            freeLoop(heigh,sum,++count);
        }else{
            return;
        }
    }
}
