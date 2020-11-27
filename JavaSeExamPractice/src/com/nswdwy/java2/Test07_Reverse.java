package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-21 18:29
 * 7、请编写代码使用把一个字符串反转，例如：hello1234，反转后：4321olleh。
 */
public class Test07_Reverse {
    public static void main(String[] args) {
        String s = "hello12345";
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() / 2; i++) {
                char temp = chars[s.length()- 1 - i];
                chars[s.length()-1 - i] = chars[i];
                chars[i] = temp;
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
