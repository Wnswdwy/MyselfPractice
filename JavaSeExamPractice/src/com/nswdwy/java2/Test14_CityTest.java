package com.nswdwy.java2;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author yycstart
 * @create 2020-08-21 19:30
 * 14、把如下信息添加到 Map 中，并遍历显示，请正确指定泛型
 * 浙江省
 *      绍兴市
 *  *      温州市
 *  *      湖州市
 *  *      嘉兴市
 *  *      台州市
 *  *      金华市
 *  *      舟山市
 *  *      衢州市
 *  *      丽水市
 * 海南省
 *      海口市
 *      三亚市
 * 北京市
 *      北京市
 */
public class Test14_CityTest {
    public static void main(String[] args) {
        LinkedList<String> strings1 = new LinkedList<>();
        LinkedList<String> strings2 = new LinkedList<>();

        strings2.add("温州市");
        strings2.add("湖州市");
        strings2.add("嘉兴");
        strings2.add("金华");
        strings2.add("台州市");
        strings2.add("舟山市");
        strings2.add("衢州市");
        strings2.add("丽水市");

        for (int i = 0; i < strings2.size(); i++) {
            strings1.add("浙江省");
        }
        System.out.println(strings1);
        strings2.add("海口市");
        strings2.add("三亚市");
        strings1.add("海南省");
        strings1.add("北京市");
        strings2.add("北京市");
        HashMap hashMap = new HashMap();
        hashMap.put(strings1,strings2);

        System.out.println(hashMap);
    }
}
