package com.qiyi.test;
import java.util.ArrayList;
import java.util.List;

/**
 * �����ַ���תΪ�ַ������toCharArray����
 */
public class Test1 {
    public static void main(String[] args) {
        String a = "helloworld";
        char[] c = a.toCharArray();
        for(char x :c){
            System.out.println(x);}
        System.out.println(c.length);
        System.out.println(a.length());
        List<Object> array=new ArrayList();
        array.add(a);
        System.out.println(array);
    }
}

