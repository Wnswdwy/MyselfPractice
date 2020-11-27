package com.nswdwy.java2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yycstart
 * @create 2020-08-21 18:49
 * 9、有一个字符串 String abc = “342567891”，请写程序将字符串abc 进行升序，可以使用JDK API 中的现有的功能方法。
 */
public class Test09_Sort {
    public static void main(String[] args) {
        String abc = "342567891";
        char[] chars = abc.toCharArray();
        Arrays.sort(chars);
        String s = new String(chars);
        System.out.println(s.toString());
    }
}
