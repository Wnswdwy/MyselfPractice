package com.nswdwy.java2;

/**
 * @author yycstart
 * @create 2020-08-20 22:29
 * 请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
 */
public class Test02_MaoPaoSortTest {
    public static void main(String[] args) {
        int[] numbers = {5,7,3,6,9,2};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length -1  - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
