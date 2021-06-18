package com.qiyi.test;
public class Demo2_String {
    public static void main(String[] args) {
        String st2 = "abc";
        String st1 = new String("abc");
        System.out.println(st1 == st2);
        System.out.println(st1 == st1.intern());
        System.out.println(st2 == st1.intern());
        System.out.println(st1.equals(st2));
    }
}