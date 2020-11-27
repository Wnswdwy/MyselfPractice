package com.nswdwy.io;

import org.junit.Test;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-10-07 16:33
 */
public class inKey {
    public static void main(String[] args) {
        InputStream files = System.in;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        inputStreamReader = new InputStreamReader(files);
        bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;

            try {
                while((line = bufferedReader.readLine())!= null){
                    if("exit".equals(line)){
                        break;
                    }
                    System.out.println(line);
                }
            } catch (IOException e) {
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
