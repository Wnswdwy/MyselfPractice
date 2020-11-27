package com.nswdwy.io;

import org.junit.Test;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-10-07 16:12
 */
public class fileStream {
    @Test
    public void test02(){
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileInputStream = new FileInputStream("aaa.txt");
            fileOutputStream = new FileOutputStream("fileStream_aaa.txt");
            inputStreamReader = new InputStreamReader(fileInputStream);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            String line = null;
            while(true){
                try {
                    if ((line = bufferedReader.readLine()) != null){
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
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
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream("aaa.txt");
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            String line = null;

                try {
                    while ((line = bufferedReader.readLine()) != null){
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
