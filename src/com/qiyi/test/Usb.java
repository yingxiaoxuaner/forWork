package com.qiyi.test;

/**
 * lambda表达式的应用
 */
//该注解限制里面只能有一个抽象方法
@FunctionalInterface
public interface Usb {
    void work(String str);
}
class TestUsb{
    public static void main(String[] args) {
        Usb usb = s ->System.out.println(s + "工作了！");//lambda表达式一个参数可以省略()
        usb.work("qiyi");
    }
}