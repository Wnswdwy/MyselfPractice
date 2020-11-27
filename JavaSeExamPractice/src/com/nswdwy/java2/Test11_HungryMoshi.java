package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-21 18:57
 */
public class Test11_HungryMoshi {
    public static void main(String[] args) {
        Bank bank1 = Bank.getBank();
        Bank bank2 = Bank.getBank();
        System.out.println(bank1==bank2);

    }
}
class Bank{
    private Bank(){

    }

    private static Bank bank = new Bank();

    static Bank getBank(){
        return bank;
    }


}