package com.nswdwy.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yycstart
 * @create 2020-10-07 15:37
 */
public class fileWriterReader {
    @org.junit.Test
    public void test1() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("aaa.txt");
            fileWriter = new FileWriter("bbb.txt");
            int read;
            while((read = fileReader.read()) != -1){
                fileWriter.write(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @org.junit.Test
    public void Test01() {
        FileReader fileReader = null;
        try {
           fileReader = new FileReader("aaa.txt");
           int re = 0;
           while((re = fileReader.read()) != -1){
               System.out.print((char)re);
           }
        } catch( Exception e) {
            e.printStackTrace();
        }finally {
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
