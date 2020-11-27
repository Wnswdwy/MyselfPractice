package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-21 18:48
 * 8、编写代码实现，从一个标准 url 里取出文件的扩展名，尽可能高效
 */
public class Test08_SplitGetExtendsName {
    public static void main(String[] args) {
        String str = fileExtNameFromUrl("http://localhost:8080/testweb/index.html");
        System.out.println(str);
    }

    private static String fileExtNameFromUrl(String s) {
        return s.substring(s.lastIndexOf('.')+1);
    }
}
