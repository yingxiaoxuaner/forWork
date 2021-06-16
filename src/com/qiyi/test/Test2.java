package com.qiyi.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试字符串转int方法，parseInt和valueOf
 * 测试int型转String的三种方法，valueOf,toString和+""
 */
public class Test2{
    public static void main(String[] args) {
        List<String> list = new ArrayList();//泛型限制List为String
        list.add("qqyumidi");
        list.add("corn");
        String a = String.valueOf(100);
        String b = Integer.toString(200);
        String c = 300 + "";
        list.add(a);
        list.add(b);
        list.add(c);
        String s = "12345";
        int d = Integer.parseInt(s);
        int e = Integer.valueOf(s).intValue();
        System.out.println(d+"\n"+e);
        for (int i = 0; i < list.size(); i++) {
            String name =  list.get(i); // 1
            System.out.println("name:" + name);
        }
    }
}
