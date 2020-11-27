package com.nswdwy.io;

import org.junit.Test;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-10-07 15:59
 */
public class bufferReadWrite {
    @Test
    public void test02(){
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileReader = new FileReader("aaa.txt");
            fileWriter = new FileWriter("buffer_aaa.txt");
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test01(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
             fileReader = new FileReader("aaa.txt");
             bufferedReader = new BufferedReader(fileReader);
             String readline = null;
             while(true){
                 try {
                     if ((readline = bufferedReader.readLine()) != null){
                         System.out.println(readline);
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

             }
        } catch (FileNotFoundException e) {
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
