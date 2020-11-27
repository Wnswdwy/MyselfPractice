package com.nswdwy.java2;

import java.util.ArrayList;

/**
 * @author yycstart
 * @create 2020-08-21 19:18
 * 13、写一段代码实现在遍历 ArrayList 时移除一个元素，例如：”java”？
 */
public class Test13_RemoveArraylist {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("bcd");
        strings.add("java");
        strings.add("auauu");
        for(Object o : strings) {
            if (o.equals("java")) {
                strings.remove(o);
            }
        }
      for(Object o:strings){
          System.out.println(o);
      }
    }
}
