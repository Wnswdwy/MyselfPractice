package com.nswdwy_yu.exer1;

/**
 * @author shkstart
 * @create 2020-08-07 18:11
 *
 * interface关键字的使用
 *
 * 1. 使用interface定义接口，接口是与类并列的概念
 *
 * 2. 接口内可以声明的结构有：
 *   jdk7及以前：全局常量、抽象方法
 *   全局常量：public static final 。可以省略不写
 *   抽象方法：public abstract 。可以省略不写
 *
 *  jdk8中：接口中定义静态方法、默认方法
 *  jdk9中：接口中定义私有方法
 *
 * 3. 接口中不能定义构造器，不能实例化接口！
 *
 * 4. 类与接口之间是实现(implements)关系，而且是多实现的。
 *    class A extends B implements C,D
 *
 *    4.1 如果实现类实现了接口中声明的所有抽象方法，则此类可以实例化
 *    4.2 如果实现类没有实现接口中声明的所有抽象方法，则此类仍为抽象类，不能实例化
 *
 * 5. 接口与接口之间存在继承关系，而且是可以多继承的。
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);

        System.out.println(Bullet.MIN_SPEED);
    }
}

interface Flyable{
    //常量
    public static final int MIN_SPEED = 1;
    int MAX_SPEED = 7900;

    void fly();
}

interface Attackable{
    void attack();
}

abstract class Plane implements Flyable{

}

class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {
        System.out.println("让子弹飞一会儿~~");
    }

    @Override
    public void attack() {
        System.out.println("子弹具备攻击性");
    }
}

//#####################

interface AA{
    void method1();
}
interface BB{
    void method2();
}

interface CC extends AA,BB{

}

class DD implements CC{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}


