package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-21 18:52
 * 编写一个懒汉式单例设计模式
 */
public class Test10_LanHanMoshi {
    public static void main(String[] args) {
        Banks banks1 = Banks.getBanks();
        Banks banks2 = Banks.getBanks();
        System.out.println(banks1 == banks2);
    }
}
class Banks{
    private Banks(){

    }
    private static Banks banks = null;

    static Banks getBanks(){
        if(banks == null){
            banks = new Banks();
        }
        return banks;
    }
}