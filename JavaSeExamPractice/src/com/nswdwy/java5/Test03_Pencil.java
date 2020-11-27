package com.nswdwy.java5;

/**
 * @author yycstart
 * @create 2020-08-24 22:43
 * 用100 元钱买 100 支笔，其中钢笔 3 元/支，圆珠笔 2 元/支，铅笔 0.5 元/支，
 * 问钢笔、圆珠笔和铅笔可以各买多少支？请写 main 方法打印需要买的数目
 */
public class Test03_Pencil {
    public static void main(String[] args) {
        int PenNumber = 0;
        int YouNumber = 0;
        int PencilNumber = 0;
        for(PenNumber = 0 ; PenNumber < 100/3 ;PenNumber++){
            for(YouNumber = 0; YouNumber < 100/2 ;YouNumber++){
                for (PencilNumber = 0; PencilNumber<100 /0.5 ; PencilNumber++) {
                        if(((PencilNumber+YouNumber+PenNumber)==100 )&&(PenNumber * 3 + YouNumber*2 + PencilNumber*0.5)<=100 ){
                            System.out.println("钢笔买："+ PenNumber + "支,圆珠笔买："
                                    + YouNumber + "支,铅笔买：" + PencilNumber + "支");
                        }
                }
            }
        }
    }
}
