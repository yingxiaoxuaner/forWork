package com.qiyi.test;
/**
 * 关于Integer的使用，从java11应该已经抛弃了Integer构造器方法
 * 从Java SE5开始就提供了自动装箱与拆箱的特性。装箱就是自动将基本数据类型转换为包装器类型；拆箱是自动将包装器类型转换为基本数据类型
 *
 */
public class Test3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 3;
        Integer i = Integer.valueOf(100);
        Integer j = new Integer(200);
        System.out.println(a==i);//自动拆包装为int型
        System.out.println(i.equals(a));//自动包装为Integer类
        System.out.println(b==j);
    }
}
