package com.nswdwy.java2;


import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-21 22:13
 * 17、请编写代码把一个 GBK 的文本文件内容读取后存储到一个UTF-8 的文本文件中。
 */
public class Test17_GBK_UTF_8 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileOutputStream fos = null;
        OutputStreamWriter oos = null;
        try {
            fis = new FileInputStream("test_gbk.txt");
            isr = new InputStreamReader(fis, "GBK");
            fos = new FileOutputStream("test_utf8.txt");
            oos= new OutputStreamWriter(fos, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        char[] data = new char[10];
        int len;
        while (true) {
            try {
                if (!((len = isr.read(data)) != -1)){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
