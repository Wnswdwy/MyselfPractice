package com.nswdwy.io;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-10-07 16:47
 */
public class IntOutKey {
    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter bufferedWriter = null;

        inputStreamReader = new InputStreamReader(in);
        bufferedReader = new BufferedReader(inputStreamReader);

        try {
            fileOutputStream = new FileOutputStream("InOutKey.txt");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            String line = null;

                try {
                    while ((line = bufferedReader.readLine()) != null){
                        if("exit".equals(line)){
                            break;
                        }
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    }
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
                    if(bufferedWriter != null){
                        try {
                            bufferedWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
